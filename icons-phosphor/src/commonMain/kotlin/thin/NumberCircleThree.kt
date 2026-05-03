package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorThinIcon(
            name = "NumberCircleThree",
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
                    PathNode.MoveTo(156.0f, 152.0f),
                    PathNode.CurveTo(156.00308f, 165.00438f, 148.13593f, 176.71732f, 136.09648f, 181.63316f),
                    PathNode.CurveTo(124.057045f, 186.54901f, 110.23998f, 183.69f, 101.14f, 174.4f),
                    PathNode.CurveTo(99.593605f, 172.82047f, 99.620476f, 170.2864f, 101.2f, 168.74f),
                    PathNode.CurveTo(102.77953f, 167.1936f, 105.31361f, 167.22046f, 106.86f, 168.8f),
                    PathNode.CurveTo(114.48455f, 176.5786f, 126.39134f, 178.24727f, 135.86043f, 172.86424f),
                    PathNode.CurveTo(145.3295f, 167.48123f, 149.98618f, 156.39648f, 147.20232f, 145.86603f),
                    PathNode.CurveTo(144.41849f, 135.33557f, 134.89221f, 128.00026f, 124.0f, 128.0f),
                    PathNode.CurveTo(122.50927f, 128.00014f, 121.14215f, 127.171295f, 120.45288f, 125.849495f),
                    PathNode.CurveTo(119.7636f, 124.52769f, 119.86656f, 122.93225f, 120.72f, 121.71f),
                    PathNode.LineTo(144.32f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(101.79086f, 88.0f, 100.0f, 86.20914f, 100.0f, 84.0f),
                    PathNode.CurveTo(100.0f, 81.79086f, 101.79086f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(153.49072f, 79.999855f, 154.85785f, 80.828705f, 155.54712f, 82.150505f),
                    PathNode.CurveTo(156.23639f, 83.47231f, 156.13344f, 85.06775f, 155.28f, 86.29f),
                    PathNode.LineTo(131.12f, 120.8f),
                    PathNode.CurveTo(145.66394f, 124.14207f, 155.97874f, 137.07703f, 156.0f, 152.0f),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
