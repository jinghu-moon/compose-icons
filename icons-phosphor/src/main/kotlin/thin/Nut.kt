package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorThinIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(103.69947f, 84.0f, 84.0f, 103.69947f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 152.30052f, 103.69947f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(152.30052f, 172.0f, 172.0f, 152.30052f, 172.0f, 128.0f),
                    PathNode.CurveTo(171.97244f, 103.71089f, 152.28911f, 84.02756f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.76f, 69.66f),
                    PathNode.LineTo(133.76f, 21.48f),
                    PathNode.CurveTo(130.17105f, 19.516296f, 125.82895f, 19.516296f, 122.24f, 21.48f),
                    PathNode.LineTo(34.24f, 69.66f),
                    PathNode.CurveTo(30.394829f, 71.76389f, 28.002638f, 75.79688f, 28.0f, 80.18f),
                    PathNode.LineTo(28.0f, 175.82f),
                    PathNode.CurveTo(28.002638f, 180.20311f, 30.394829f, 184.2361f, 34.24f, 186.34f),
                    PathNode.LineTo(122.24f, 234.52f),
                    PathNode.CurveTo(125.826546f, 236.49307f, 130.17345f, 236.49307f, 133.76f, 234.52f),
                    PathNode.LineTo(221.76f, 186.34f),
                    PathNode.LineTo(221.76f, 186.34f),
                    PathNode.CurveTo(225.60518f, 184.2361f, 227.99736f, 180.20311f, 228.0f, 175.82f),
                    PathNode.LineTo(228.0f, 80.18f),
                    PathNode.CurveTo(227.99736f, 75.79688f, 225.60518f, 71.76389f, 221.76f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 175.82f),
                    PathNode.CurveTo(219.99669f, 177.27866f, 219.19963f, 178.61986f, 217.92f, 179.32f),
                    PathNode.LineTo(129.92f, 227.5f),
                    PathNode.CurveTo(128.72368f, 228.15457f, 127.27631f, 228.15457f, 126.08f, 227.5f),
                    PathNode.LineTo(38.08f, 179.33f),
                    PathNode.CurveTo(36.79723f, 178.62813f, 35.99966f, 177.28223f, 36.0f, 175.82f),
                    PathNode.LineTo(36.0f, 80.18f),
                    PathNode.CurveTo(36.00331f, 78.72135f, 36.80037f, 77.38015f, 38.08f, 76.68f),
                    PathNode.LineTo(126.08f, 28.5f),
                    PathNode.CurveTo(127.27338f, 27.83403f, 128.72662f, 27.83403f, 129.92f, 28.5f),
                    PathNode.LineTo(217.92f, 76.68f),
                    PathNode.CurveTo(219.19963f, 77.38015f, 219.99669f, 78.72135f, 220.0f, 80.18f),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
