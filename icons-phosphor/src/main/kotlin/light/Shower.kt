package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorLightIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(62.0f, 236.0f),
                    PathNode.CurveTo(62.0f, 241.52284f, 57.522846f, 246.0f, 52.0f, 246.0f),
                    PathNode.CurveTo(46.477154f, 246.0f, 42.0f, 241.52284f, 42.0f, 236.0f),
                    PathNode.CurveTo(42.0f, 230.47716f, 46.477154f, 226.0f, 52.0f, 226.0f),
                    PathNode.CurveTo(57.522846f, 226.0f, 62.0f, 230.47716f, 62.0f, 236.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 194.0f),
                    PathNode.CurveTo(78.47715f, 194.0f, 74.0f, 198.47716f, 74.0f, 204.0f),
                    PathNode.CurveTo(74.0f, 209.52284f, 78.47715f, 214.0f, 84.0f, 214.0f),
                    PathNode.CurveTo(89.52285f, 214.0f, 94.0f, 209.52284f, 94.0f, 204.0f),
                    PathNode.CurveTo(94.0f, 198.47716f, 89.52285f, 194.0f, 84.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 194.0f),
                    PathNode.CurveTo(14.477153f, 194.0f, 10.0f, 198.47716f, 10.0f, 204.0f),
                    PathNode.CurveTo(10.0f, 209.52284f, 14.477153f, 214.0f, 20.0f, 214.0f),
                    PathNode.CurveTo(25.522848f, 214.0f, 30.0f, 209.52284f, 30.0f, 204.0f),
                    PathNode.CurveTo(30.0f, 198.47716f, 25.522848f, 194.0f, 20.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 162.0f),
                    PathNode.CurveTo(46.477154f, 162.0f, 42.0f, 166.47716f, 42.0f, 172.0f),
                    PathNode.CurveTo(42.0f, 177.52284f, 46.477154f, 182.0f, 52.0f, 182.0f),
                    PathNode.CurveTo(57.522846f, 182.0f, 62.0f, 177.52284f, 62.0f, 172.0f),
                    PathNode.CurveTo(62.0f, 166.47716f, 57.522846f, 162.0f, 52.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.0f, 40.0f),
                    PathNode.CurveTo(254.0f, 43.31371f, 251.3137f, 46.0f, 248.0f, 46.0f),
                    PathNode.LineTo(218.49f, 46.0f),
                    PathNode.LineTo(189.59f, 74.89f),
                    PathNode.LineTo(167.83f, 202.32f),
                    PathNode.CurveTo(166.95972f, 207.4885f, 163.27538f, 211.73799f, 158.28242f, 213.3321f),
                    PathNode.CurveTo(153.28947f, 214.92622f, 147.82431f, 213.59795f, 144.12f, 209.89f),
                    PathNode.LineTo(46.12f, 111.89f),
                    PathNode.CurveTo(42.41113f, 108.18154f, 41.08615f, 102.7111f, 42.687096f, 97.71657f),
                    PathNode.CurveTo(44.288044f, 92.72203f, 48.546352f, 89.04126f, 53.72f, 88.18f),
                    PathNode.LineTo(181.12f, 66.42f),
                    PathNode.LineTo(211.77f, 35.77f),
                    PathNode.CurveTo(212.89005f, 34.64324f, 214.41127f, 34.0067f, 216.0f, 34.0f),
                    PathNode.LineTo(248.0f, 34.0f),
                    PathNode.CurveTo(251.3137f, 34.0f, 254.0f, 36.68629f, 254.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.66f, 79.34f),
                    PathNode.LineTo(55.7f, 100.0f),
                    PathNode.CurveTo(54.955513f, 100.11489f, 54.338734f, 100.63835f, 54.104324f, 101.35425f),
                    PathNode.CurveTo(53.869915f, 102.070145f, 54.057644f, 102.85703f, 54.59f, 103.39f),
                    PathNode.LineTo(152.59f, 201.39f),
                    PathNode.CurveTo(153.12021f, 201.92166f, 153.90353f, 202.11154f, 154.61833f, 201.88171f),
                    PathNode.CurveTo(155.33315f, 201.65187f, 155.85901f, 201.04105f, 155.98f, 200.3f),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
