package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorBoldIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.4f, 51.6f),
                    PathNode.CurveTo(162.2139f, 9.449766f, 93.848785f, 9.469148f, 51.686592f, 51.64329f),
                    PathNode.CurveTo(9.524402f, 93.81744f, 9.524402f, 162.18256f, 51.686592f, 204.3567f),
                    PathNode.CurveTo(93.848785f, 246.53085f, 162.2139f, 246.55022f, 204.4f, 204.4f),
                    PathNode.CurveTo(246.53166f, 162.17941f, 246.53166f, 93.82059f, 204.4f, 51.6f),
                    PathNode.Close,
                    PathNode.MoveTo(68.58f, 68.6f),
                    PathNode.CurveTo(81.09327f, 56.05511f, 97.27396f, 47.817665f, 114.78f, 45.08f),
                    PathNode.CurveTo(109.03213f, 80.93629f, 80.91628f, 109.05213f, 45.06f, 114.8f),
                    PathNode.CurveTo(47.793625f, 97.28684f, 56.031357f, 81.09858f, 68.58f, 68.58f),
                    PathNode.Close,
                    PathNode.MoveTo(44.74f, 139.07f),
                    PathNode.CurveTo(68.76728f, 136.22685f, 91.127754f, 125.3444f, 108.19f, 108.19f),
                    PathNode.CurveTo(125.3444f, 91.127754f, 136.22685f, 68.76728f, 139.07f, 44.74f),
                    PathNode.CurveTo(176.69933f, 49.68969f, 206.3103f, 79.30067f, 211.26f, 116.93f),
                    PathNode.CurveTo(161.85577f, 122.91174f, 122.916985f, 161.8464f, 116.93f, 211.25f),
                    PathNode.CurveTo(79.30063f, 206.30794f, 49.687283f, 176.69868f, 44.74f, 139.07f),
                    PathNode.Close,
                    PathNode.MoveTo(187.42f, 187.42f),
                    PathNode.CurveTo(174.90425f, 199.96149f, 158.72475f, 208.19833f, 141.22f, 210.94f),
                    PathNode.CurveTo(146.96786f, 175.08371f, 175.08371f, 146.96786f, 210.94f, 141.22f),
                    PathNode.CurveTo(208.20233f, 158.72604f, 199.96489f, 174.90674f, 187.42f, 187.42f),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
