package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorThinIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 148.0f),
                    PathNode.CurveTo(156.00308f, 161.00438f, 148.13593f, 172.71732f, 136.09648f, 177.63316f),
                    PathNode.CurveTo(124.057045f, 182.54901f, 110.23998f, 179.69f, 101.14f, 170.4f),
                    PathNode.CurveTo(99.593605f, 168.82047f, 99.620476f, 166.2864f, 101.2f, 164.74f),
                    PathNode.CurveTo(102.77953f, 163.1936f, 105.31361f, 163.22046f, 106.86f, 164.8f),
                    PathNode.CurveTo(114.48455f, 172.5786f, 126.39134f, 174.24727f, 135.86043f, 168.86424f),
                    PathNode.CurveTo(145.3295f, 163.48123f, 149.98618f, 152.39648f, 147.20232f, 141.86603f),
                    PathNode.CurveTo(144.41849f, 131.33557f, 134.89221f, 124.00026f, 124.0f, 124.0f),
                    PathNode.CurveTo(122.50927f, 124.000145f, 121.14215f, 123.171295f, 120.45288f, 121.849495f),
                    PathNode.CurveTo(119.7636f, 120.52769f, 119.86656f, 118.93225f, 120.72f, 117.71f),
                    PathNode.LineTo(144.32f, 84.0f),
                    PathNode.LineTo(104.0f, 84.0f),
                    PathNode.CurveTo(101.79086f, 84.0f, 100.0f, 82.20914f, 100.0f, 80.0f),
                    PathNode.CurveTo(100.0f, 77.79086f, 101.79086f, 76.0f, 104.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(153.49072f, 75.999855f, 154.85785f, 76.828705f, 155.54712f, 78.150505f),
                    PathNode.CurveTo(156.23639f, 79.47231f, 156.13344f, 81.06775f, 155.28f, 82.29f),
                    PathNode.LineTo(131.12f, 116.8f),
                    PathNode.CurveTo(145.66394f, 120.14207f, 155.97874f, 133.07703f, 156.0f, 148.0f),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
