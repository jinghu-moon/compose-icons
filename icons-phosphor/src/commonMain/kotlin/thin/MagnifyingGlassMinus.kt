package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorThinIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 112.0f),
                    PathNode.CurveTo(148.0f, 114.20914f, 146.20914f, 116.0f, 144.0f, 116.0f),
                    PathNode.LineTo(80.0f, 116.0f),
                    PathNode.CurveTo(77.79086f, 116.0f, 76.0f, 114.20914f, 76.0f, 112.0f),
                    PathNode.CurveTo(76.0f, 109.79086f, 77.79086f, 108.0f, 80.0f, 108.0f),
                    PathNode.LineTo(144.0f, 108.0f),
                    PathNode.CurveTo(146.20914f, 108.0f, 148.0f, 109.79086f, 148.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.83f, 226.83f),
                    PathNode.CurveTo(226.07973f, 227.58112f, 225.06163f, 228.00314f, 224.0f, 228.00314f),
                    PathNode.CurveTo(222.93837f, 228.00314f, 221.92027f, 227.58112f, 221.17f, 226.83f),
                    PathNode.LineTo(168.47f, 174.13f),
                    PathNode.CurveTo(134.67822f, 204.84834f, 82.54738f, 202.9862f, 51.033463f, 169.93513f),
                    PathNode.CurveTo(19.519543f, 136.88405f, 20.140371f, 84.72366f, 52.432014f, 52.432014f),
                    PathNode.CurveTo(84.72366f, 20.140371f, 136.88405f, 19.519543f, 169.93513f, 51.033463f),
                    PathNode.CurveTo(202.9862f, 82.54738f, 204.84834f, 134.67822f, 174.13f, 168.47f),
                    PathNode.LineTo(226.83f, 221.17f),
                    PathNode.CurveTo(227.58112f, 221.92027f, 228.00314f, 222.93837f, 228.00314f, 224.0f),
                    PathNode.CurveTo(228.00314f, 225.06163f, 227.58112f, 226.07973f, 226.83f, 226.83f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 188.0f),
                    PathNode.CurveTo(153.97365f, 188.0f, 188.0f, 153.97365f, 188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 70.02636f, 153.97365f, 36.0f, 112.0f, 36.0f),
                    PathNode.CurveTo(70.02636f, 36.0f, 36.0f, 70.02636f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.044098f, 153.95538f, 70.04464f, 187.9559f, 112.0f, 188.0f),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
