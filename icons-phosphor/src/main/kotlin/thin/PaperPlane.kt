package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorThinIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.43f, 202.08f),
                    PathNode.LineTo(138.35f, 34.14f),
                    PathNode.CurveTo(136.22488f, 30.360386f, 132.22607f, 28.02119f, 127.89f, 28.02119f),
                    PathNode.CurveTo(123.553925f, 28.02119f, 119.55511f, 30.360386f, 117.43f, 34.14f),
                    PathNode.LineTo(21.55f, 202.14f),
                    PathNode.CurveTo(19.128023f, 206.49403f, 19.648449f, 211.89174f, 22.857672f, 215.70284f),
                    PathNode.CurveTo(26.066896f, 219.51393f, 31.297255f, 220.94551f, 36.0f, 219.3f),
                    PathNode.LineTo(128.0f, 188.22f),
                    PathNode.LineTo(219.94f, 219.28f),
                    PathNode.CurveTo(224.65887f, 220.9677f, 229.92963f, 219.54514f, 233.15852f, 215.71234f),
                    PathNode.CurveTo(236.38742f, 211.87956f, 236.89441f, 206.4438f, 234.43f, 202.08f),
                    PathNode.Close,
                    PathNode.MoveTo(227.0f, 210.56f),
                    PathNode.CurveTo(225.91652f, 211.87086f, 224.1142f, 212.3386f, 222.53f, 211.72f),
                    PathNode.LineTo(132.0f, 181.13f),
                    PathNode.LineTo(132.0f, 120.0f),
                    PathNode.CurveTo(132.0f, 117.79086f, 130.20914f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(125.79086f, 116.0f, 124.0f, 117.79086f, 124.0f, 120.0f),
                    PathNode.LineTo(124.0f, 181.13f),
                    PathNode.LineTo(33.37f, 211.74f),
                    PathNode.CurveTo(31.806122f, 212.29692f, 30.060783f, 211.83f, 28.983892f, 210.56659f),
                    PathNode.CurveTo(27.907003f, 209.3032f, 27.722408f, 207.50594f, 28.52f, 206.05f),
                    PathNode.LineTo(124.39f, 38.05f),
                    PathNode.CurveTo(125.094475f, 36.776737f, 126.434845f, 35.986492f, 127.89f, 35.986492f),
                    PathNode.CurveTo(129.34515f, 35.986492f, 130.68553f, 36.776737f, 131.39f, 38.05f),
                    PathNode.LineTo(227.47f, 206.0f),
                    PathNode.CurveTo(228.31425f, 207.46207f, 228.12473f, 209.3009f, 227.0f, 210.56f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
