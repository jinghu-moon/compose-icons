package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = lucideOutlineIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.562f, 3.266f),
                    PathNode.CurveTo(11.649909f, 3.106336f, 11.817735f, 3.007156f, 12.0f, 3.007156f),
                    PathNode.CurveTo(12.182265f, 3.007156f, 12.350091f, 3.106336f, 12.438f, 3.266f),
                    PathNode.LineTo(15.39f, 8.87f),
                    PathNode.CurveTo(15.53254f, 9.132747f, 15.785147f, 9.317949f, 16.0786f, 9.374859f),
                    PathNode.CurveTo(16.372053f, 9.431768f, 16.675577f, 9.354417f, 16.906f, 9.164f),
                    PathNode.LineTo(21.183f, 5.5f),
                    PathNode.CurveTo(21.351452f, 5.362991f, 21.589075f, 5.350363f, 21.7711f, 5.468746f),
                    PathNode.CurveTo(21.953123f, 5.58713f, 22.037935f, 5.809463f, 21.981f, 6.019f),
                    PathNode.LineTo(19.147f, 16.265f),
                    PathNode.CurveTo(19.028143f, 16.695795f, 18.637878f, 16.995434f, 18.191f, 16.999f),
                    PathNode.LineTo(5.81f, 16.999f),
                    PathNode.CurveTo(5.362751f, 16.995878f, 4.971961f, 16.69615f, 4.853f, 16.265f),
                    PathNode.LineTo(2.02f, 6.02f),
                    PathNode.CurveTo(1.963066f, 5.810463f, 2.047877f, 5.58813f, 2.229901f, 5.469746f),
                    PathNode.CurveTo(2.411925f, 5.351362f, 2.649549f, 5.363991f, 2.818f, 5.501f),
                    PathNode.LineTo(7.094f, 9.165f),
                    PathNode.CurveTo(7.324423f, 9.355417f, 7.627948f, 9.432769f, 7.9214f, 9.375859f),
                    PathNode.CurveTo(8.214854f, 9.318949f, 8.46746f, 9.133746f, 8.61f, 8.871f),
                    PathNode.Close
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
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f)
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
        return _crown!!
    }

private var _crown: ImageVector? = null
