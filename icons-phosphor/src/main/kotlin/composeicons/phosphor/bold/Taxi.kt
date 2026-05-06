package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Taxi: ImageVector
    get() {
        if (_taxi != null) return _taxi!!
        _taxi = phosphorBoldIcon(
            name = "Taxi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 100h-9L204.72 54.08C201.161 47.849 194.536 44.002 187.36 44h-19.24l-11-27.43C154.109 8.969 146.755 3.984 138.58 4h-21.16C109.234 3.972 101.865 8.959 98.85 16.57L87.88 44h-19.24c-7.176 .002-13.801 3.849-17.36 10.08L25 100h-9C9.373 100 4 105.373 4 112c0 6.627 5.373 12 12 12h4v76c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-20h80v20c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-76h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM120.12 28h15.76l6.4 16h-28.56ZM71 68h114l18.28 32h-150.6ZM64 196h-20v-16h20ZM212 196h-20v-16h20ZM212 156h-168v-32h168Z"),
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
        return _taxi!!
    }

private var _taxi: ImageVector? = null
