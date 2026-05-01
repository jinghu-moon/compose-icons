package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) return _toteSimple!!
        _toteSimple = phosphorBoldIcon(
            name = "ToteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.0f, 66.75f),
                    PathNode.CurveTo(235.19011f, 62.46558f, 229.73335f, 60.01004f, 224.0f, 60.0f),
                    PathNode.LineTo(179.83f, 60.0f),
                    PathNode.CurveTo(177.6413f, 32.99884f, 155.08972f, 12.201322f, 128.0f, 12.201322f),
                    PathNode.CurveTo(100.91028f, 12.201322f, 78.3587f, 32.99884f, 76.17f, 60.0f),
                    PathNode.LineTo(32.08f, 60.0f),
                    PathNode.CurveTo(26.352657f, 59.9775f, 20.89049f, 62.411503f, 17.077593f, 66.685234f),
                    PathNode.CurveTo(13.264697f, 70.95897f, 11.466988f, 76.66229f, 12.14f, 82.35f),
                    PathNode.LineTo(26.39f, 202.35f),
                    PathNode.CurveTo(27.610176f, 212.43282f, 36.173622f, 220.0128f, 46.33f, 220.0f),
                    PathNode.LineTo(209.67f, 220.0f),
                    PathNode.CurveTo(219.82637f, 220.0128f, 228.38983f, 212.43282f, 229.61f, 202.35f),
                    PathNode.LineTo(243.86f, 82.35f),
                    PathNode.CurveTo(244.5349f, 76.69523f, 242.76714f, 71.02091f, 239.0f, 66.75f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(141.91772f, 36.0014f, 153.72176f, 46.22503f, 155.71f, 60.0f),
                    PathNode.LineTo(100.29f, 60.0f),
                    PathNode.CurveTo(102.27825f, 46.22503f, 114.08228f, 36.0014f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.19f, 196.0f),
                    PathNode.LineTo(49.81f, 196.0f),
                    PathNode.LineTo(36.5f, 84.0f),
                    PathNode.LineTo(219.5f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
