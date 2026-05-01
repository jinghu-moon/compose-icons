package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorLightIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.12f, 55.87f),
                    PathNode.CurveTo(174.42325f, 29.753078f, 136.69305f, 19.42484f, 101.277214f, 28.812836f),
                    PathNode.CurveTo(65.86137f, 38.200832f, 38.201523f, 65.86259f, 28.815983f, 101.27908f),
                    PathNode.CurveTo(19.430443f, 136.69559f, 29.761297f, 174.42508f, 55.88f, 200.12f),
                    PathNode.CurveTo(81.57675f, 226.23692f, 119.30694f, 236.56516f, 154.7228f, 227.17717f),
                    PathNode.CurveTo(190.13864f, 217.78917f, 217.79848f, 190.12741f, 227.18402f, 154.7109f),
                    PathNode.CurveTo(236.56955f, 119.29442f, 226.23871f, 81.56494f, 200.12f, 55.87f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 207.64f),
                    PathNode.LineTo(86.0f, 176.0f),
                    PathNode.CurveTo(86.0f, 174.89543f, 86.89543f, 174.0f, 88.0f, 174.0f),
                    PathNode.LineTo(168.0f, 174.0f),
                    PathNode.CurveTo(169.10457f, 174.0f, 170.0f, 174.89543f, 170.0f, 176.0f),
                    PathNode.LineTo(170.0f, 207.64f),
                    PathNode.CurveTo(143.70343f, 221.4525f, 112.29656f, 221.4525f, 86.0f, 207.64f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 142.0f),
                    PathNode.LineTo(152.0f, 142.0f),
                    PathNode.CurveTo(153.10457f, 142.0f, 154.0f, 142.89543f, 154.0f, 144.0f),
                    PathNode.LineTo(154.0f, 162.0f),
                    PathNode.LineTo(102.0f, 162.0f),
                    PathNode.LineTo(102.0f, 144.0f),
                    PathNode.CurveTo(102.0f, 142.89543f, 102.89543f, 142.0f, 104.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.54f, 130.0f),
                    PathNode.LineTo(126.0f, 79.59f),
                    PathNode.CurveTo(126.18928f, 78.65787f, 127.00885f, 77.98799f, 127.96f, 77.98799f),
                    PathNode.CurveTo(128.91115f, 77.98799f, 129.73073f, 78.65787f, 129.92f, 79.59f),
                    PathNode.LineTo(140.46f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.64f, 191.64f),
                    PathNode.CurveTo(188.62238f, 194.64464f, 185.40141f, 197.4379f, 182.0f, 200.0f),
                    PathNode.LineTo(182.0f, 176.0f),
                    PathNode.CurveTo(182.0f, 168.26802f, 175.73198f, 162.0f, 168.0f, 162.0f),
                    PathNode.LineTo(166.0f, 162.0f),
                    PathNode.LineTo(166.0f, 144.0f),
                    PathNode.CurveTo(166.01015f, 136.54436f, 160.1755f, 130.38875f, 152.73f, 130.0f),
                    PathNode.LineTo(141.73f, 77.1f),
                    PathNode.CurveTo(140.38564f, 70.598175f, 134.65936f, 65.93477f, 128.02f, 65.93477f),
                    PathNode.CurveTo(121.380646f, 65.93477f, 115.65436f, 70.598175f, 114.31f, 77.1f),
                    PathNode.LineTo(103.31f, 130.0f),
                    PathNode.CurveTo(95.848724f, 130.36818f, 89.99092f, 136.52965f, 90.0f, 144.0f),
                    PathNode.LineTo(90.0f, 162.0f),
                    PathNode.LineTo(88.0f, 162.0f),
                    PathNode.CurveTo(80.26801f, 162.0f, 74.0f, 168.26802f, 74.0f, 176.0f),
                    PathNode.LineTo(74.0f, 200.0f),
                    PathNode.CurveTo(70.59826f, 197.4347f, 67.3773f, 194.63808f, 64.36f, 191.63f),
                    PathNode.CurveTo(29.21313f, 156.4827f, 29.213364f, 99.498055f, 64.36052f, 64.351036f),
                    PathNode.CurveTo(99.507675f, 29.204025f, 156.49232f, 29.204025f, 191.63948f, 64.351036f),
                    PathNode.CurveTo(226.78664f, 99.498055f, 226.78687f, 156.4827f, 191.64f, 191.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
