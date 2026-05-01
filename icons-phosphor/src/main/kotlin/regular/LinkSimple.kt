package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorRegularIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.66f, 90.34f),
                    PathNode.CurveTo(167.16223f, 91.840546f, 168.00629f, 93.876724f, 168.00629f, 96.0f),
                    PathNode.CurveTo(168.00629f, 98.123276f, 167.16223f, 100.159454f, 165.66f, 101.66f),
                    PathNode.LineTo(101.66f, 165.66f),
                    PathNode.CurveTo(98.534065f, 168.78593f, 93.465935f, 168.78593f, 90.34f, 165.66f),
                    PathNode.CurveTo(87.214066f, 162.53407f, 87.214066f, 157.46593f, 90.34f, 154.34f),
                    PathNode.LineTo(154.34f, 90.34f),
                    PathNode.CurveTo(155.84055f, 88.83778f, 157.87672f, 87.993706f, 160.0f, 87.993706f),
                    PathNode.CurveTo(162.12328f, 87.993706f, 164.15945f, 88.83778f, 165.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(215.6f, 40.4f),
                    PathNode.CurveTo(205.0978f, 29.896727f, 190.85312f, 23.99596f, 176.0f, 23.99596f),
                    PathNode.CurveTo(161.14688f, 23.99596f, 146.9022f, 29.896727f, 136.4f, 40.4f),
                    PathNode.LineTo(106.34f, 70.45f),
                    PathNode.CurveTo(103.214066f, 73.575935f, 103.214066f, 78.644066f, 106.34f, 81.77f),
                    PathNode.CurveTo(109.465935f, 84.895935f, 114.534065f, 84.895935f, 117.66f, 81.77f),
                    PathNode.LineTo(147.72f, 51.77f),
                    PathNode.CurveTo(163.38861f, 36.445515f, 188.4714f, 36.58365f, 203.97028f, 52.07978f),
                    PathNode.CurveTo(219.46915f, 67.57591f, 219.61171f, 92.65868f, 204.29f, 108.33f),
                    PathNode.LineTo(174.22f, 138.39f),
                    PathNode.CurveTo(171.09407f, 141.51317f, 171.09183f, 146.57907f, 174.215f, 149.705f),
                    PathNode.CurveTo(177.33817f, 152.83093f, 182.40407f, 152.83316f, 185.53f, 149.71f),
                    PathNode.LineTo(215.6f, 119.6f),
                    PathNode.CurveTo(226.10327f, 109.0978f, 232.00404f, 94.85311f, 232.00404f, 80.0f),
                    PathNode.CurveTo(232.00404f, 65.14689f, 226.10327f, 50.902203f, 215.6f, 40.4f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
