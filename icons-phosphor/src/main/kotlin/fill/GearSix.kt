package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GearSix: ImageVector
    get() {
        if (_gearSix != null) return _gearSix!!
        _gearSix = phosphorFillIcon(
            name = "GearSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.94f, 107.21f),
                    PathNode.CurveTo(237.48912f, 104.93047f, 236.06938f, 102.95963f, 234.05f, 101.81f),
                    PathNode.LineTo(204.22f, 84.81f),
                    PathNode.LineTo(204.1f, 51.19f),
                    PathNode.CurveTo(204.09267f, 48.84667f, 203.05827f, 46.624374f, 201.27f, 45.11f),
                    PathNode.CurveTo(190.4493f, 35.95698f, 177.98843f, 28.942661f, 164.55f, 24.44f),
                    PathNode.CurveTo(162.40996f, 23.71565f, 160.06342f, 23.929962f, 158.09f, 25.03f),
                    PathNode.LineTo(128.0f, 41.85f),
                    PathNode.LineTo(97.88f, 25.0f),
                    PathNode.CurveTo(95.90533f, 23.893724f, 93.554436f, 23.675713f, 91.41f, 24.4f),
                    PathNode.CurveTo(77.97969f, 28.931578f, 65.5324f, 35.97305f, 54.73f, 45.15f),
                    PathNode.CurveTo(52.944378f, 46.66211f, 51.91026f, 48.880165f, 51.9f, 51.22f),
                    PathNode.LineTo(51.75f, 84.87f),
                    PathNode.LineTo(21.92f, 101.87f),
                    PathNode.CurveTo(19.900623f, 103.01963f, 18.480886f, 104.99048f, 18.03f, 107.27f),
                    PathNode.CurveTo(15.299962f, 120.98883f, 15.299962f, 135.11118f, 18.03f, 148.83f),
                    PathNode.CurveTo(18.480886f, 151.10953f, 19.900623f, 153.08037f, 21.92f, 154.23f),
                    PathNode.LineTo(51.75f, 171.23f),
                    PathNode.LineTo(51.87f, 204.86f),
                    PathNode.CurveTo(51.877335f, 207.20334f, 52.911724f, 209.42563f, 54.7f, 210.94f),
                    PathNode.CurveTo(65.52071f, 220.09302f, 77.98156f, 227.10735f, 91.42f, 231.61f),
                    PathNode.CurveTo(93.560036f, 232.33435f, 95.906586f, 232.12004f, 97.88f, 231.02f),
                    PathNode.LineTo(128.0f, 214.15f),
                    PathNode.LineTo(158.12f, 231.0f),
                    PathNode.CurveTo(159.31198f, 231.66414f, 160.6555f, 232.00864f, 162.02f, 232.0f),
                    PathNode.CurveTo(162.89372f, 231.9997f, 163.76163f, 231.85786f, 164.59f, 231.58f),
                    PathNode.CurveTo(178.017f, 227.05045f, 190.46346f, 220.01624f, 201.27f, 210.85f),
                    PathNode.CurveTo(203.05562f, 209.33789f, 204.08974f, 207.11983f, 204.1f, 204.78f),
                    PathNode.LineTo(204.25f, 171.13f),
                    PathNode.LineTo(234.08f, 154.13f),
                    PathNode.CurveTo(236.09938f, 152.98036f, 237.51912f, 151.00952f, 237.97f, 148.73f),
                    PathNode.CurveTo(240.68483f, 135.02214f, 240.67464f, 120.913925f, 237.94f, 107.21f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _gearSix!!
    }

private var _gearSix: ImageVector? = null
