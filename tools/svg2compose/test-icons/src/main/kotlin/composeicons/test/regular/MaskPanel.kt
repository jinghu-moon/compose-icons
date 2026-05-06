package composeicons.test.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.test.TestIcons
import composeicons.test.testIcon

val TestIcons.Regular.MaskPanel: ImageVector
    get() {
        if (_maskPanel != null) return _maskPanel!!
        _maskPanel = testIcon(
            name = "MaskPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 0.000 0.000 L 15.000 0.000 L 15.000 15.000 L 0.000 15.000 ZM 5.000 3.000 L 5.000 12.000 L 13.000 12.000 L 13.000 3.000 Z"),
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
        return _maskPanel!!
    }

private var _maskPanel: ImageVector? = null
