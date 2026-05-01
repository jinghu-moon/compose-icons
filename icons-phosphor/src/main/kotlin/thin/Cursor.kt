package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorThinIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.17f, 135.51f),
                    PathNode.CurveTo(164.24649f, 134.5827f, 163.835f, 133.26228f, 164.06824f, 131.9745f),
                    PathNode.CurveTo(164.30147f, 130.68672f, 165.14992f, 129.5945f, 166.34f, 129.05f),
                    PathNode.LineTo(212.65f, 111.26f),
                    PathNode.LineTo(212.81f, 111.2f),
                    PathNode.CurveTo(217.32384f, 109.18738f, 220.14214f, 104.61321f, 219.90997f, 99.67646f),
                    PathNode.CurveTo(219.67784f, 94.7397f, 216.44278f, 90.45019f, 211.76f, 88.87f),
                    PathNode.LineTo(51.67f, 36.6f),
                    PathNode.CurveTo(47.396324f, 35.242336f, 42.72225f, 36.380714f, 39.551483f, 39.551483f),
                    PathNode.CurveTo(36.380714f, 42.72225f, 35.242336f, 47.396324f, 36.6f, 51.67f),
                    PathNode.LineTo(88.87f, 211.76f),
                    PathNode.CurveTo(90.38463f, 216.50055f, 94.69774f, 219.79129f, 99.67f, 220.0f),
                    PathNode.LineTo(100.25f, 220.0f),
                    PathNode.CurveTo(105.03069f, 220.03949f, 109.36765f, 217.2047f, 111.25f, 212.81f),
                    PathNode.LineTo(111.31f, 212.65f),
                    PathNode.LineTo(129.1f, 166.34f),
                    PathNode.CurveTo(129.64351f, 165.14612f, 130.73787f, 164.29462f, 132.0287f, 164.06119f),
                    PathNode.CurveTo(133.31953f, 163.82776f, 134.64278f, 164.24208f, 135.57f, 165.17f),
                    PathNode.LineTo(186.88f, 216.49f),
                    PathNode.CurveTo(189.13162f, 218.74945f, 192.19019f, 220.01947f, 195.38f, 220.01947f),
                    PathNode.CurveTo(198.56982f, 220.01947f, 201.62837f, 218.74945f, 203.88f, 216.49f),
                    PathNode.LineTo(216.57f, 203.8f),
                    PathNode.CurveTo(218.82945f, 201.54837f, 220.09946f, 198.48982f, 220.09946f, 195.3f),
                    PathNode.CurveTo(220.09946f, 192.11017f, 218.82945f, 189.05162f, 216.57f, 186.8f),
                    PathNode.Close,
                    PathNode.MoveTo(210.83f, 198.14f),
                    PathNode.LineTo(198.14f, 210.83f),
                    PathNode.CurveTo(197.38972f, 211.58112f, 196.37164f, 212.00314f, 195.31f, 212.00314f),
                    PathNode.CurveTo(194.24837f, 212.00314f, 193.23027f, 211.58112f, 192.48f, 210.83f),
                    PathNode.LineTo(141.17f, 159.52f),
                    PathNode.CurveTo(138.92172f, 157.26892f, 135.87152f, 156.0028f, 132.69f, 156.0f),
                    PathNode.CurveTo(131.93845f, 156.00046f, 131.18855f, 156.07076f, 130.45f, 156.21f),
                    PathNode.CurveTo(126.548584f, 156.94865f, 123.26516f, 159.5694f, 121.68f, 163.21f),
                    PathNode.LineTo(121.62f, 163.37f),
                    PathNode.LineTo(103.83f, 209.68f),
                    PathNode.CurveTo(103.1217f, 211.12454f, 101.61686f, 212.00414f, 100.01063f, 211.91248f),
                    PathNode.CurveTo(98.40438f, 211.82082f, 97.00938f, 210.77574f, 96.47f, 209.26f),
                    PathNode.LineTo(44.2f, 49.19f),
                    PathNode.CurveTo(43.763897f, 47.77369f, 44.146564f, 46.232334f, 45.19445f, 45.18445f),
                    PathNode.CurveTo(46.242332f, 44.136562f, 47.783688f, 43.753895f, 49.2f, 44.19f),
                    PathNode.LineTo(209.27f, 96.47f),
                    PathNode.CurveTo(210.78575f, 97.00938f, 211.83083f, 98.40438f, 211.92249f, 100.01063f),
                    PathNode.CurveTo(212.01414f, 101.61686f, 211.13457f, 103.1217f, 209.69f, 103.83f),
                    PathNode.LineTo(163.38f, 121.61f),
                    PathNode.LineTo(163.22f, 121.68f),
                    PathNode.CurveTo(159.57712f, 123.26131f, 156.95251f, 126.54247f, 156.2099f, 130.44371f),
                    PathNode.CurveTo(155.46729f, 134.34494f, 156.70285f, 138.3609f, 159.51f, 141.17f),
                    PathNode.LineTo(210.83f, 192.48f),
                    PathNode.CurveTo(211.58112f, 193.23027f, 212.00314f, 194.24837f, 212.00314f, 195.31f),
                    PathNode.CurveTo(212.00314f, 196.37164f, 211.58112f, 197.38972f, 210.83f, 198.14f),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
