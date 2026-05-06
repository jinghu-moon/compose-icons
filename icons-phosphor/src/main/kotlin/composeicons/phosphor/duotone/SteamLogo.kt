package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorDuotoneIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C74.981 32 32 74.981 32 128c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C224 74.981 181.019 32 128 32ZM173.81 129.61l-61.09 49.82c-7.951 6.535-19.563 5.968-26.841-1.309-7.277-7.277-7.844-18.89-1.309-26.841L134.39 90.19c6.776-8.201 17.615-11.854 27.973-9.427 10.358 2.427 18.446 10.515 20.873 20.873 2.427 10.358-1.225 21.197-9.427 27.973Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM117.39 185.92l62-50.55c10.452-8.811 15.012-22.782 11.77-36.063C187.918 86.026 177.433 75.728 164.096 72.724c-13.337-3.003-27.224 1.807-35.846 12.416l-43 52.73L45.28 98C60.851 55.1 106.634 31.223 150.724 43.008c44.09 11.785 71.854 55.321 63.944 100.269-7.911 44.947-48.871 76.388-94.335 72.412C74.868 211.712 39.988 173.638 40 128c.003-3.973 .27-7.942 .8-11.88l34.57 34.57c-6.267 11.685-3.478 26.164 6.681 34.685 10.159 8.521 24.902 8.749 35.319 .545ZM121.58 118.55c3.53 11.408 12.462 20.34 23.87 23.87l-18.26 14.89c-2.511-10.102-10.398-17.989-20.5-20.5ZM156 128c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM100 152c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
