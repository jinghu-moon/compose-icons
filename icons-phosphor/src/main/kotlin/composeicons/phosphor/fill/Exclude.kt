package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorFillIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 160c-.025 41.316-31.507 75.816-72.648 79.613C126.21 243.41 88.946 215.254 81.36 174.64c25.921 4.821 52.554-3.439 71.197-22.083 18.644-18.644 26.904-45.276 22.083-71.197C212.523 88.412 239.996 121.467 240 160ZM160 80c4.911 .005 9.812 .46 14.64 1.36C167.253 41.642 131.412 13.664 91.088 16.139 50.765 18.614 18.614 50.765 16.139 91.088c-2.475 40.324 25.503 76.164 65.221 83.552-4.352-23.377 1.922-47.479 17.119-65.768C113.676 90.583 136.221 80.003 160 80Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
