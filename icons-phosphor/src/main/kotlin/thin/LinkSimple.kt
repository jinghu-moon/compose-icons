package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorThinIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.84f, 93.16f),
                    PathNode.CurveTo(163.59111f, 93.91027f, 164.01315f, 94.92836f, 164.01315f, 95.99f),
                    PathNode.CurveTo(164.01315f, 97.051636f, 163.59111f, 98.069725f, 162.84f, 98.82f),
                    PathNode.LineTo(98.84f, 162.82f),
                    PathNode.CurveTo(97.27703f, 164.38297f, 94.742966f, 164.38297f, 93.18f, 162.82f),
                    PathNode.CurveTo(91.617035f, 161.25703f, 91.617035f, 158.72296f, 93.18f, 157.16f),
                    PathNode.LineTo(157.18f, 93.16f),
                    PathNode.CurveTo(157.93027f, 92.40889f, 158.94836f, 91.986855f, 160.01f, 91.986855f),
                    PathNode.CurveTo(161.07166f, 91.986855f, 162.08972f, 92.40889f, 162.84f, 93.16f),
                    PathNode.Close,
                    PathNode.MoveTo(212.79f, 43.21f),
                    PathNode.CurveTo(192.46437f, 22.927412f, 159.55563f, 22.927412f, 139.23f, 43.21f),
                    PathNode.LineTo(109.17f, 73.27f),
                    PathNode.CurveTo(107.67445f, 74.84133f, 107.70396f, 77.31836f, 109.23651f, 78.85362f),
                    PathNode.CurveTo(110.76906f, 80.38888f, 113.246025f, 80.42277f, 114.82f, 78.93f),
                    PathNode.LineTo(144.89f, 48.87f),
                    PathNode.CurveTo(162.0771f, 31.6829f, 189.9429f, 31.6829f, 207.13f, 48.87f),
                    PathNode.CurveTo(224.31711f, 66.0571f, 224.31711f, 93.9229f, 207.13f, 111.11f),
                    PathNode.LineTo(177.06f, 141.17f),
                    PathNode.CurveTo(175.49704f, 142.73297f, 175.49704f, 145.26703f, 177.06f, 146.83f),
                    PathNode.CurveTo(178.62297f, 148.39296f, 181.15703f, 148.39296f, 182.72f, 146.83f),
                    PathNode.LineTo(212.79f, 116.77f),
                    PathNode.CurveTo(233.07259f, 96.44437f, 233.07259f, 63.535633f, 212.79f, 43.21f),
                    PathNode.Close,
                    PathNode.MoveTo(141.17f, 177.06f),
                    PathNode.LineTo(111.11f, 207.13f),
                    PathNode.CurveTo(93.9229f, 224.31711f, 66.0571f, 224.31711f, 48.87f, 207.13f),
                    PathNode.CurveTo(31.6829f, 189.9429f, 31.6829f, 162.0771f, 48.87f, 144.89f),
                    PathNode.LineTo(78.93f, 114.83f),
                    PathNode.CurveTo(80.492966f, 113.26704f, 80.492966f, 110.73296f, 78.93f, 109.17f),
                    PathNode.CurveTo(77.367035f, 107.60703f, 74.83297f, 107.60703f, 73.27f, 109.17f),
                    PathNode.LineTo(43.21f, 139.23f),
                    PathNode.CurveTo(22.896967f, 159.54303f, 22.896967f, 192.47696f, 43.21f, 212.79f),
                    PathNode.CurveTo(63.523033f, 233.10303f, 96.45697f, 233.10303f, 116.77f, 212.79f),
                    PathNode.LineTo(146.83f, 182.72f),
                    PathNode.CurveTo(148.39296f, 181.15703f, 148.39296f, 178.62297f, 146.83f, 177.06f),
                    PathNode.CurveTo(145.26703f, 175.49704f, 142.73297f, 175.49704f, 141.17f, 177.06f),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
