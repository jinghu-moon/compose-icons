package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorBoldIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.05 110.42l112 64c3.687 2.105 8.213 2.105 11.9 0l112-64c3.74-2.136 6.048-6.113 6.048-10.42 0-4.307-2.308-8.284-6.048-10.42l-112-64c-3.687-2.105-8.213-2.105-11.9 0L10.05 89.58C6.31 91.716 4.002 95.693 4.002 100c0 4.307 2.308 8.284 6.048 10.42ZM128.05 49.82 215.81 100 128 150.18 40.19 100ZM250.47 142.05c3.286 5.755 1.284 13.084-4.47 16.37l-112 64c-3.687 2.105-8.213 2.105-11.9 0l-112-64C6.321 156.323 3.962 152.355 3.924 148.034c-.038-4.322 2.251-8.33 5.992-10.493 3.741-2.164 8.357-2.148 12.084 .04l106 60.6L234 137.58c2.768-1.594 6.057-2.018 9.139-1.179 3.082 .839 5.702 2.872 7.281 5.649Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
