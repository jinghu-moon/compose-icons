package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorLightIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(115.76f, 155.76f),
                    PathNode.LineTo(211.76f, 59.76f),
                    PathNode.CurveTo(214.12408f, 57.55713f, 217.80807f, 57.622128f, 220.09297f, 59.907024f),
                    PathNode.CurveTo(222.37787f, 62.19192f, 222.44287f, 65.87592f, 220.24f, 68.24f),
                    PathNode.LineTo(124.24f, 164.24f),
                    PathNode.CurveTo(121.87592f, 166.44287f, 118.191925f, 166.37787f, 115.90703f, 164.09297f),
                    PathNode.CurveTo(113.62213f, 161.80807f, 113.55713f, 158.12408f, 115.76f, 155.76f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 86.0f),
                    PathNode.CurveTo(135.16698f, 85.99276f, 142.28714f, 87.15468f, 149.08f, 89.44f),
                    PathNode.CurveTo(152.22249f, 90.49763f, 155.62738f, 88.8075f, 156.685f, 85.665f),
                    PathNode.CurveTo(157.74263f, 82.5225f, 156.0525f, 79.11762f, 152.91f, 78.06f),
                    PathNode.CurveTo(127.647026f, 69.544235f, 99.78455f, 74.52102f, 79.03186f, 91.25607f),
                    PathNode.CurveTo(58.279186f, 107.99113f, 47.511105f, 134.1662f, 50.48f, 160.66f),
                    PathNode.CurveTo(50.81789f, 163.7136f, 53.40781f, 166.01863f, 56.48f, 166.0f),
                    PathNode.CurveTo(56.703094f, 166.01463f, 56.926907f, 166.01463f, 57.15f, 166.0f),
                    PathNode.CurveTo(60.44059f, 165.63362f, 62.81246f, 162.67102f, 62.45f, 159.38f),
                    PathNode.CurveTo(62.168213f, 156.92981f, 62.017998f, 154.46628f, 62.0f, 152.0f),
                    PathNode.CurveTo(62.04408f, 115.56748f, 91.56748f, 86.04408f, 128.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 101.9f),
                    PathNode.CurveTo(224.48674f, 98.9508f, 220.8692f, 97.78674f, 217.92f, 99.3f),
                    PathNode.CurveTo(214.9708f, 100.81326f, 213.80673f, 104.4308f, 215.32f, 107.38f),
                    PathNode.CurveTo(227.52927f, 131.34154f, 229.39394f, 159.2575f, 220.48f, 184.63f),
                    PathNode.CurveTo(220.20717f, 185.45209f, 219.43616f, 186.0051f, 218.57f, 186.0f),
                    PathNode.LineTo(37.46f, 186.0f),
                    PathNode.CurveTo(36.590294f, 185.97807f, 35.82711f, 185.41467f, 35.55f, 184.59f),
                    PathNode.CurveTo(25.085518f, 154.59828f, 29.76981f, 121.39759f, 48.12369f, 95.47186f),
                    PathNode.CurveTo(66.47757f, 69.546135f, 96.23525f, 54.095917f, 128.0f, 54.0f),
                    PathNode.LineTo(128.9f, 54.0f),
                    PathNode.CurveTo(144.10893f, 54.097134f, 159.08192f, 57.7693f, 172.61f, 64.72f),
                    PathNode.CurveTo(175.57025f, 66.23602f, 179.19897f, 65.06525f, 180.715f, 62.105f),
                    PathNode.CurveTo(182.23102f, 59.144753f, 181.06024f, 55.51602f, 178.1f, 54.0f),
                    PathNode.CurveTo(162.90071f, 46.205265f, 146.0812f, 42.09459f, 129.0f, 42.0f),
                    PathNode.LineTo(128.0f, 42.0f),
                    PathNode.CurveTo(92.311485f, 42.01762f, 58.847034f, 59.33877f, 38.226063f, 88.466866f),
                    PathNode.CurveTo(17.60509f, 117.594955f, 12.387867f, 154.91348f, 24.23f, 188.58f),
                    PathNode.CurveTo(26.20222f, 194.20331f, 31.500916f, 197.97607f, 37.46f, 198.0f),
                    PathNode.LineTo(218.53f, 198.0f),
                    PathNode.CurveTo(224.47435f, 197.98532f, 229.76715f, 194.2339f, 231.75f, 188.63f),
                    PathNode.CurveTo(241.78062f, 160.15097f, 239.7025f, 128.80557f, 226.0f, 101.9f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
