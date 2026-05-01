package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateDot: ImageVector
    get() {
        if (_rotateDot != null) return _rotateDot!!
        _rotateDot = tablerOutlineIcon(
            name = "RotateDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.95f, 11.0f),
                    PathNode.CurveTo(19.426823f, 7.008668f, 16.019388f, 4.027731f, 11.993933f, 4.039767f),
                    PathNode.CurveTo(7.968476f, 4.051804f, 4.578929f, 7.053065f, 4.07963f, 11.047454f),
                    PathNode.CurveTo(3.580331f, 15.041843f, 6.126813f, 18.785107f, 10.025446f, 19.787655f),
                    PathNode.CurveTo(13.92408f, 20.790203f, 17.96044f, 18.73974f, 19.45f, 15.0f),
                    PathNode.MoveTo(19.95f, 20.0f),
                    PathNode.LineTo(19.95f, 15.0f),
                    PathNode.LineTo(14.95f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 12.552285f, 11.447715f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.552285f, 13.0f, 13.0f, 12.552285f, 13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 11.447715f, 12.552285f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(11.447715f, 11.0f, 11.0f, 11.447715f, 11.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rotateDot!!
    }

private var _rotateDot: ImageVector? = null
