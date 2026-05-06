package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorBoldIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM164 112c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM149.6 161.85c-13.232 8.202-29.968 8.202-43.2 0-3.628-2.344-8.235-2.557-12.063-.559-3.829 1.998-6.289 5.899-6.441 10.215-.152 4.316 2.026 8.381 5.704 10.644 21.053 13.132 47.747 13.132 68.8 0 3.678-2.263 5.857-6.328 5.704-10.644-.152-4.316-2.612-8.217-6.441-10.215-3.829-1.998-8.436-1.784-12.063 .559ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C211.943 82.415 175.571 45.178 130 44.05c-9.46 14.2-10 27.28-10 28 .014 4.418 3.607 7.989 8.025 7.975 4.418-.014 7.989-3.607 7.975-8.025 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 17.673-14.327 32-32 32C110.327 104 96 89.673 96 72c0-.63 .1-10.48 5-23.52C60.419 62.255 36.714 104.371 45.993 146.21c9.279 41.839 48.567 69.985 91.167 65.312C179.759 206.849 212.011 170.856 212 128Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
