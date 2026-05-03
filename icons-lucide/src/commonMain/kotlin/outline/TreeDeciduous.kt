package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) return _treeDeciduous!!
        _treeDeciduous = lucideOutlineIcon(
            name = "TreeDeciduous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 19.0f),
                    PathNode.CurveTo(6.238402f, 19.003946f, 4.681594f, 17.854975f, 4.16612f, 16.170477f),
                    PathNode.CurveTo(3.650645f, 14.48598f, 4.297865f, 12.662551f, 5.76f, 11.68f),
                    PathNode.CurveTo(4.861493f, 10.557322f, 4.741079f, 8.999321f, 5.456406f, 7.751913f),
                    PathNode.CurveTo(6.171735f, 6.504504f, 7.577233f, 5.821541f, 9.0f, 6.03f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 4.343146f, 10.343145f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(13.656855f, 3.0f, 15.0f, 4.343146f, 15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 6.04f),
                    PathNode.CurveTo(16.422768f, 5.831541f, 17.828266f, 6.514505f, 18.543594f, 7.761913f),
                    PathNode.CurveTo(19.25892f, 9.009321f, 19.138508f, 10.567322f, 18.24f, 11.69f),
                    PathNode.CurveTo(19.692728f, 12.675685f, 20.332964f, 14.493412f, 19.818613f, 16.171936f),
                    PathNode.CurveTo(19.304266f, 17.850458f, 17.75556f, 18.997429f, 16.0f, 19.0f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
        return _treeDeciduous!!
    }

private var _treeDeciduous: ImageVector? = null
