package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorLightIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.24f, 132.24f),
                    PathNode.LineTo(228.24f, 156.24f),
                    PathNode.CurveTo(225.89746f, 158.57962f, 222.10254f, 158.57962f, 219.76f, 156.24f),
                    PathNode.LineTo(195.76f, 132.24f),
                    PathNode.CurveTo(194.15477f, 130.74423f, 193.494f, 128.49156f, 194.03691f, 126.3657f),
                    PathNode.CurveTo(194.57982f, 124.23982f, 196.23982f, 122.57983f, 198.36569f, 122.03692f),
                    PathNode.CurveTo(200.49156f, 121.494f, 202.74425f, 122.15478f, 204.24f, 123.76f),
                    PathNode.LineTo(218.0f, 137.51f),
                    PathNode.LineTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.01758f, 88.9019f, 192.79012f, 54.264854f, 155.57195f, 42.28696f),
                    PathNode.CurveTo(118.353775f, 30.309067f, 77.659645f, 43.730614f, 54.87f, 75.5f),
                    PathNode.CurveTo(53.648106f, 77.31381f, 51.53609f, 78.319115f, 49.35784f, 78.12375f),
                    PathNode.CurveTo(47.179596f, 77.92838f, 45.28018f, 76.5633f, 44.400543f, 74.56101f),
                    PathNode.CurveTo(43.52091f, 72.55871f, 43.800404f, 70.236404f, 45.13f, 68.5f),
                    PathNode.CurveTo(70.96116f, 32.5043f, 117.075294f, 17.300173f, 159.24985f, 30.873955f),
                    PathNode.CurveTo(201.42436f, 44.447735f, 230.01346f, 83.69493f, 230.0f, 128.0f),
                    PathNode.LineTo(230.0f, 137.51f),
                    PathNode.LineTo(243.76f, 123.76f),
                    PathNode.CurveTo(245.25575f, 122.15478f, 247.50844f, 121.494f, 249.63431f, 122.03692f),
                    PathNode.CurveTo(251.76018f, 122.57983f, 253.42018f, 124.23982f, 253.96309f, 126.3657f),
                    PathNode.CurveTo(254.506f, 128.49156f, 253.84523f, 130.74423f, 252.24f, 132.24f),
                    PathNode.Close,
                    PathNode.MoveTo(210.85f, 187.5f),
                    PathNode.CurveTo(185.01343f, 223.4777f, 138.91031f, 238.6688f, 96.74711f, 225.0972f),
                    PathNode.CurveTo(54.583908f, 211.52559f, 25.99864f, 172.29361f, 26.0f, 128.0f),
                    PathNode.LineTo(26.0f, 118.49f),
                    PathNode.LineTo(12.24f, 132.24f),
                    PathNode.CurveTo(9.875922f, 134.44287f, 6.191922f, 134.37787f, 3.907026f, 132.09297f),
                    PathNode.CurveTo(1.622129f, 129.80807f, 1.557129f, 126.12408f, 3.76f, 123.76f),
                    PathNode.LineTo(27.76f, 99.76f),
                    PathNode.CurveTo(30.10254f, 97.42038f, 33.89746f, 97.42038f, 36.24f, 99.76f),
                    PathNode.LineTo(60.24f, 123.76f),
                    PathNode.CurveTo(61.845226f, 125.25577f, 62.505993f, 127.508446f, 61.963085f, 129.63431f),
                    PathNode.CurveTo(61.420174f, 131.76018f, 59.760178f, 133.42018f, 57.63431f, 133.96309f),
                    PathNode.CurveTo(55.508446f, 134.506f, 53.255764f, 133.84523f, 51.76f, 132.24f),
                    PathNode.LineTo(38.0f, 118.49f),
                    PathNode.LineTo(38.0f, 128.0f),
                    PathNode.CurveTo(37.983006f, 150.92195f, 46.746716f, 172.97972f, 62.49f, 189.64f),
                    PathNode.CurveTo(71.917305f, 174.98141f, 86.00863f, 163.92677f, 102.49f, 158.26f),
                    PathNode.CurveTo(85.616005f, 147.021f, 78.08988f, 126.059746f, 83.960945f, 106.65414f),
                    PathNode.CurveTo(89.83201f, 87.24853f, 107.715706f, 73.97489f, 127.99f, 73.97489f),
                    PathNode.CurveTo(148.2643f, 73.97489f, 166.148f, 87.24853f, 172.01906f, 106.65414f),
                    PathNode.CurveTo(177.89012f, 126.059746f, 170.364f, 147.021f, 153.49f, 158.26f),
                    PathNode.CurveTo(169.97733f, 163.93175f, 184.07007f, 174.99806f, 193.49f, 189.67f),
                    PathNode.CurveTo(196.21759f, 186.78513f, 198.74986f, 183.72168f, 201.07f, 180.5f),
                    PathNode.CurveTo(202.2919f, 178.68619f, 204.40392f, 177.6809f, 206.58215f, 177.87625f),
                    PathNode.CurveTo(208.7604f, 178.07161f, 210.65982f, 179.43669f, 211.53946f, 181.439f),
                    PathNode.CurveTo(212.4191f, 183.44128f, 212.1396f, 185.7636f, 210.81f, 187.5f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 154.0f),
                    PathNode.CurveTo(146.77768f, 154.0f, 162.0f, 138.77768f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 101.22232f, 146.77768f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(109.22232f, 86.0f, 94.0f, 101.22232f, 94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 138.77768f, 109.22232f, 154.0f, 128.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(148.58592f, 217.98097f, 168.54657f, 210.92401f, 184.57f, 198.0f),
                    PathNode.CurveTo(172.63553f, 178.14835f, 151.16791f, 166.00589f, 128.005f, 166.00589f),
                    PathNode.CurveTo(104.842094f, 166.00589f, 83.37447f, 178.14835f, 71.44f, 198.0f),
                    PathNode.CurveTo(87.43427f, 210.96922f, 107.40834f, 218.03218f, 128.0f, 218.0f),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
