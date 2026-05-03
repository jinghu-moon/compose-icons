package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = lucideOutlineIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.7f, 6.3f),
                    PathNode.CurveTo(14.318857f, 6.688844f, 14.318857f, 7.311157f, 14.7f, 7.7f),
                    PathNode.LineTo(16.3f, 9.3f),
                    PathNode.CurveTo(16.688843f, 9.681143f, 17.311157f, 9.681143f, 17.7f, 9.3f),
                    PathNode.LineTo(20.806f, 6.195f),
                    PathNode.CurveTo(21.126f, 5.873f, 21.669f, 5.975f, 21.789f, 6.413f),
                    PathNode.CurveTo(22.405785f, 8.656272f, 21.67015f, 11.053896f, 19.901384f, 12.565239f),
                    PathNode.CurveTo(18.132618f, 14.076583f, 15.64959f, 14.429182f, 13.53f, 13.47f),
                    PathNode.LineTo(5.62f, 21.38f),
                    PathNode.CurveTo(4.791573f, 22.20815f, 3.448651f, 22.207928f, 2.6205f, 21.3795f),
                    PathNode.CurveTo(1.792349f, 20.551073f, 1.792573f, 19.20815f, 2.621f, 18.38f),
                    PathNode.LineTo(10.531f, 10.47f),
                    PathNode.CurveTo(9.571818f, 8.35041f, 9.924417f, 5.867382f, 11.43576f, 4.098615f),
                    PathNode.CurveTo(12.947104f, 2.329849f, 15.344728f, 1.594216f, 17.588f, 2.211f),
                    PathNode.CurveTo(18.026f, 2.331f, 18.128f, 2.873f, 17.807f, 3.195f),
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
        }
        return _wrench!!
    }

private var _wrench: ImageVector? = null
