package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorRegularIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 152.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 99.58172f, 195.58173f, 96.0f, 200.0f, 96.0f),
                    PathNode.CurveTo(204.41827f, 96.0f, 208.0f, 99.58172f, 208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 156.41827f, 204.41827f, 160.0f, 200.0f, 160.0f),
                    PathNode.CurveTo(195.58173f, 160.0f, 192.0f, 156.41827f, 192.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.CurveTo(227.58173f, 80.0f, 224.0f, 83.58172f, 224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 172.41827f, 227.58173f, 176.0f, 232.0f, 176.0f),
                    PathNode.CurveTo(236.41827f, 176.0f, 240.0f, 172.41827f, 240.0f, 168.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(240.0f, 83.58172f, 236.41827f, 80.0f, 232.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.92f, 210.62f),
                    PathNode.CurveTo(223.88303f, 212.7287f, 224.56061f, 215.73003f, 223.69395f, 218.47755f),
                    PathNode.CurveTo(222.82729f, 221.2251f, 220.55025f, 223.29443f, 217.73259f, 223.89514f),
                    PathNode.CurveTo(214.91493f, 224.49586f, 211.9919f, 223.53516f, 210.08f, 221.38f),
                    PathNode.LineTo(168.0f, 175.09f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(167.99771f, 227.05403f, 166.25682f, 229.84032f, 163.51299f, 231.18141f),
                    PathNode.CurveTo(160.76915f, 232.5225f, 157.50114f, 232.18442f, 155.09f, 230.31f),
                    PathNode.LineTo(85.25f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(31.163445f, 176.0f, 24.0f, 168.83656f, 24.0f, 160.0f),
                    PathNode.LineTo(24.0f, 96.0f),
                    PathNode.CurveTo(24.0f, 87.163445f, 31.163445f, 80.0f, 40.0f, 80.0f),
                    PathNode.LineTo(81.55f, 80.0f),
                    PathNode.LineTo(50.08f, 45.38f),
                    PathNode.CurveTo(47.172737f, 42.102833f, 47.442047f, 37.0969f, 50.68412f, 34.15056f),
                    PathNode.CurveTo(53.926197f, 31.204214f, 58.934998f, 31.413485f, 61.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 157.49f),
                    PathNode.LineTo(96.1f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(89.77982f, 159.9971f, 91.50901f, 160.59229f, 92.91f, 161.69f),
                    PathNode.LineTo(152.0f, 207.64f),
                    PathNode.Close,
                    PathNode.MoveTo(125.06f, 69.31f),
                    PathNode.LineTo(152.0f, 48.31f),
                    PathNode.LineTo(152.0f, 106.78f),
                    PathNode.CurveTo(152.0f, 111.19828f, 155.58173f, 114.78f, 160.0f, 114.78f),
                    PathNode.CurveTo(164.41827f, 114.78f, 168.0f, 111.19828f, 168.0f, 106.78f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(167.99771f, 28.94596f, 166.25682f, 26.159683f, 163.51299f, 24.818584f),
                    PathNode.CurveTo(160.76915f, 23.477488f, 157.50114f, 23.815582f, 155.09f, 25.69f),
                    PathNode.LineTo(115.24f, 56.69f),
                    PathNode.CurveTo(111.82477f, 59.42337f, 111.23821f, 64.39302f, 113.923256f, 67.84638f),
                    PathNode.CurveTo(116.60829f, 71.29974f, 121.56919f, 71.95618f, 125.06f, 69.32f),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
