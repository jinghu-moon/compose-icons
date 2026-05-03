package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SendHorizontal: ImageVector
    get() {
        if (_sendHorizontal != null) return _sendHorizontal!!
        _sendHorizontal = lucideOutlineIcon(
            name = "SendHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.714f, 3.048f),
                    PathNode.CurveTo(3.529941f, 2.958149f, 3.309639f, 2.990154f, 3.158756f, 3.128666f),
                    PathNode.CurveTo(3.007873f, 3.267177f, 2.957184f, 3.483945f, 3.031f, 3.675f),
                    PathNode.LineTo(5.874f, 11.302f),
                    PathNode.CurveTo(6.041673f, 11.752229f, 6.041673f, 12.247771f, 5.874f, 12.698f),
                    PathNode.LineTo(3.032f, 20.325f),
                    PathNode.CurveTo(2.958562f, 20.515808f, 3.009208f, 20.732117f, 3.159719f, 20.87049f),
                    PathNode.CurveTo(3.310231f, 21.008863f, 3.530025f, 21.041185f, 3.714f, 20.952f),
                    PathNode.LineTo(21.714f, 12.452f),
                    PathNode.CurveTo(21.888775f, 12.369344f, 22.000235f, 12.193335f, 22.000235f, 12.0f),
                    PathNode.CurveTo(22.000235f, 11.806665f, 21.888775f, 11.630656f, 21.714f, 11.548f),
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(22.0f, 12.0f)
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
        return _sendHorizontal!!
    }

private var _sendHorizontal: ImageVector? = null
