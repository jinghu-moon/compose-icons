package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateClockwise: ImageVector
    get() {
        if (_rotateClockwise != null) return _rotateClockwise!!
        _rotateClockwise = tablerOutlineIcon(
            name = "RotateClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.05f, 11.0f),
                    PathNode.CurveTo(4.573177f, 7.008668f, 7.980612f, 4.027731f, 12.006067f, 4.039767f),
                    PathNode.CurveTo(16.031525f, 4.051804f, 19.421072f, 7.053065f, 19.92037f, 11.047454f),
                    PathNode.CurveTo(20.419668f, 15.041843f, 17.873188f, 18.785107f, 13.974554f, 19.787655f),
                    PathNode.CurveTo(10.07592f, 20.790203f, 6.039561f, 18.73974f, 4.55f, 15.0f),
                    PathNode.MoveTo(4.05f, 20.0f),
                    PathNode.LineTo(4.05f, 15.0f),
                    PathNode.LineTo(9.05f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rotateClockwise!!
    }

private var _rotateClockwise: ImageVector? = null
