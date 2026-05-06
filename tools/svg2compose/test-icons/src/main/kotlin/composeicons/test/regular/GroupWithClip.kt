package composeicons.test.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.test.TestIcons
import composeicons.test.testIcon

val TestIcons.Regular.GroupWithClip: ImageVector
    get() {
        if (_groupWithClip != null) return _groupWithClip!!
        _groupWithClip = testIcon(
            name = "GroupWithClip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            group(
                clipPathData = parseSvgPathData("M 0.000 0.000 L 10.000 0.000 L 10.000 10.000 L 0.000 10.000 Z"),
                groupAlpha = 0.5f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 1.000 1.000 L 9.000 1.000 L 9.000 9.000 Z"),
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
        }
        return _groupWithClip!!
    }

private var _groupWithClip: ImageVector? = null
