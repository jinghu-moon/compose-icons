package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorFillIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM176 160c0 20.661-13.221 39.003-32.821 45.537-19.6 6.533-41.183-.208-53.579-16.737-2.651-3.535-1.935-8.549 1.6-11.2 3.535-2.651 8.549-1.935 11.2 1.6 8.264 11.019 22.652 15.514 35.719 11.158C151.186 186.002 160 173.774 160 160v-12.26c-14.104 12.615-34.303 15.767-51.579 8.048C91.145 148.07 80.015 130.922 80 112v-8C80.015 85.078 91.145 67.93 108.421 60.212c17.276-7.718 37.475-4.566 51.579 8.048v-4.26c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM160 104v8c0 17.673-14.327 32-32 32C110.327 144 96 129.673 96 112v-8C96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
