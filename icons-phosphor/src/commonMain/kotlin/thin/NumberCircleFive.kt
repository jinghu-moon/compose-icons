package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorThinIcon(
            name = "NumberCircleFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.39f, 84.0f),
                    PathNode.LineTo(109.52f, 119.21f),
                    PathNode.CurveTo(114.043526f, 117.06375f, 118.99325f, 115.96647f, 124.0f, 116.0f),
                    PathNode.CurveTo(141.67311f, 116.0f, 156.0f, 130.32689f, 156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 165.67311f, 141.67311f, 180.0f, 124.0f, 180.0f),
                    PathNode.CurveTo(115.44942f, 180.15086f, 107.202354f, 176.83183f, 101.14f, 170.8f),
                    PathNode.CurveTo(99.593605f, 169.22046f, 99.620476f, 166.6864f, 101.2f, 165.14f),
                    PathNode.CurveTo(102.77953f, 163.5936f, 105.31361f, 163.62047f, 106.86f, 165.2f),
                    PathNode.CurveTo(111.41924f, 169.6904f, 117.60236f, 172.14343f, 124.0f, 172.0f),
                    PathNode.CurveTo(137.25484f, 172.0f, 148.0f, 161.25484f, 148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 134.74516f, 137.25484f, 124.0f, 124.0f, 124.0f),
                    PathNode.CurveTo(117.60236f, 123.85655f, 111.41924f, 126.3096f, 106.86f, 130.8f),
                    PathNode.CurveTo(105.63861f, 132.055f, 103.74287f, 132.36957f, 102.181595f, 131.57632f),
                    PathNode.CurveTo(100.62032f, 130.78308f, 99.75658f, 129.06647f, 100.05f, 127.34f),
                    PathNode.LineTo(108.05f, 79.34f),
                    PathNode.CurveTo(108.37277f, 77.41055f, 110.04374f, 75.99764f, 112.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(154.20914f, 76.0f, 156.0f, 77.79086f, 156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 82.20914f, 154.20914f, 84.0f, 152.0f, 84.0f),
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
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
