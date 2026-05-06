package composeicons.test.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.test.TestIcons
import composeicons.test.testIcon

val TestIcons.Regular.PathWithTransform: ImageVector
    get() {
        if (_pathWithTransform != null) return _pathWithTransform!!
        _pathWithTransform = testIcon(
            name = "PathWithTransform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            group(
            ) {
                addPath(
                    pathData = parseSvgPathData("M 14.000 14.000 L 1.000 14.000"),
                    pathFillType = PathFillType.NonZero,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeAlpha = 1f,
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
        }
        return _pathWithTransform!!
    }

private var _pathWithTransform: ImageVector? = null
