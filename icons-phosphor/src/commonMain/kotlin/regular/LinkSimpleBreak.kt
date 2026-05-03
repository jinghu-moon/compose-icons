package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorRegularIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.03758f, 94.85977f, 226.13272f, 109.11783f, 215.6f, 119.6f),
                    PathNode.LineTo(185.53f, 149.66f),
                    PathNode.CurveTo(182.40407f, 152.78317f, 177.33817f, 152.78093f, 174.215f, 149.655f),
                    PathNode.CurveTo(171.09183f, 146.52907f, 171.09407f, 141.46317f, 174.22f, 138.34f),
                    PathNode.LineTo(204.29f, 108.28f),
                    PathNode.CurveTo(214.58282f, 98.21323f, 218.6716f, 83.39167f, 214.99597f, 69.471466f),
                    PathNode.CurveTo(211.32036f, 55.55127f, 200.44748f, 44.680325f, 186.52664f, 41.007164f),
                    PathNode.CurveTo(172.60579f, 37.334f, 157.78496f, 41.425396f, 147.72f, 51.72f),
                    PathNode.LineTo(117.66f, 81.77f),
                    PathNode.CurveTo(114.534065f, 84.895935f, 109.465935f, 84.895935f, 106.34f, 81.77f),
                    PathNode.CurveTo(103.214066f, 78.644066f, 103.214066f, 73.575935f, 106.34f, 70.45f),
                    PathNode.LineTo(136.4f, 40.4f),
                    PathNode.CurveTo(152.41595f, 24.382408f, 176.50398f, 19.590494f, 197.43082f, 28.258932f),
                    PathNode.CurveTo(218.35765f, 36.92737f, 232.00163f, 57.348858f, 232.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.34f, 174.22f),
                    PathNode.LineTo(108.28f, 204.28f),
                    PathNode.CurveTo(98.21323f, 214.57283f, 83.39167f, 218.6616f, 69.471466f, 214.98598f),
                    PathNode.CurveTo(55.55127f, 211.31035f, 44.680325f, 200.43748f, 41.007164f, 186.51665f),
                    PathNode.CurveTo(37.334f, 172.5958f, 41.425396f, 157.77495f, 51.72f, 147.71f),
                    PathNode.LineTo(81.77f, 117.66f),
                    PathNode.CurveTo(84.895935f, 114.534065f, 84.895935f, 109.465935f, 81.77f, 106.34f),
                    PathNode.CurveTo(78.644066f, 103.214066f, 73.575935f, 103.214066f, 70.45f, 106.34f),
                    PathNode.LineTo(40.4f, 136.4f),
                    PathNode.CurveTo(18.529524f, 158.27048f, 18.529524f, 193.72952f, 40.4f, 215.6f),
                    PathNode.CurveTo(62.270477f, 237.47047f, 97.72952f, 237.47047f, 119.6f, 215.6f),
                    PathNode.LineTo(149.66f, 185.53f),
                    PathNode.CurveTo(152.78317f, 182.40407f, 152.78093f, 177.33817f, 149.655f, 174.215f),
                    PathNode.CurveTo(146.52907f, 171.09183f, 141.46317f, 171.09407f, 138.34f, 174.22f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
