package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorThinIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 221.17f),
                    PathNode.LineTo(174.13f, 168.47f),
                    PathNode.CurveTo(204.84834f, 134.67822f, 202.9862f, 82.54738f, 169.93513f, 51.033463f),
                    PathNode.CurveTo(136.88405f, 19.519543f, 84.72366f, 20.140371f, 52.432014f, 52.432014f),
                    PathNode.CurveTo(20.140371f, 84.72366f, 19.519543f, 136.88405f, 51.033463f, 169.93513f),
                    PathNode.CurveTo(82.54738f, 202.9862f, 134.67822f, 204.84834f, 168.47f, 174.13f),
                    PathNode.LineTo(221.17f, 226.83f),
                    PathNode.CurveTo(222.73297f, 228.39296f, 225.26703f, 228.39296f, 226.83f, 226.83f),
                    PathNode.CurveTo(228.39296f, 225.26703f, 228.39296f, 222.73297f, 226.83f, 221.17f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 70.02636f, 70.02636f, 36.0f, 112.0f, 36.0f),
                    PathNode.CurveTo(153.97365f, 36.0f, 188.0f, 70.02636f, 188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 153.97365f, 153.97365f, 188.0f, 112.0f, 188.0f),
                    PathNode.CurveTo(70.04464f, 187.9559f, 36.044098f, 153.95538f, 36.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
