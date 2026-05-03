package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) return _brandSteam!!
        _brandSteam = tablerFilledIcon(
            name = "BrandSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.5f, 4.0f),
                    PathNode.CurveTo(18.498777f, 4.004627f, 20.337708f, 5.093259f, 21.303143f, 6.843421f),
                    PathNode.CurveTo(22.26858f, 8.593582f, 22.208529f, 10.729741f, 21.146296f, 12.422902f),
                    PathNode.CurveTo(20.084064f, 14.116064f, 18.18688f, 15.099668f, 16.191f, 14.992f),
                    PathNode.LineTo(16.113f, 14.985f),
                    PathNode.LineTo(12.467f, 17.509f),
                    PathNode.LineTo(12.456f, 17.603f),
                    PathNode.CurveTo(12.189f, 19.378f, 10.749f, 20.783f, 8.885f, 20.983f),
                    PathNode.LineTo(8.676f, 21.0f),
                    PathNode.LineTo(8.5f, 21.0f),
                    PathNode.CurveTo(6.821707f, 21.000204f, 5.321753f, 19.952715f, 4.744f, 18.377f),
                    PathNode.LineTo(4.728f, 18.329f),
                    PathNode.LineTo(2.606f, 17.419f),
                    PathNode.CurveTo(2.277842f, 17.27838f, 2.049544f, 16.973475f, 2.007f, 16.619f),
                    PathNode.LineTo(2.0f, 16.5f),
                    PathNode.LineTo(2.0f, 13.0f),
                    PathNode.CurveTo(2.000185f, 12.65356f, 2.179668f, 12.331897f, 2.474394f, 12.149805f),
                    PathNode.CurveTo(2.769121f, 11.967714f, 3.137098f, 11.951141f, 3.447f, 12.106f),
                    PathNode.LineTo(6.411f, 13.587f),
                    PathNode.LineTo(6.585f, 13.487f),
                    PathNode.CurveTo(7.242411f, 13.128224f, 7.987342f, 12.961221f, 8.735f, 13.005f),
                    PathNode.LineTo(8.901f, 13.019f),
                    PathNode.LineTo(11.027f, 10.042f),
                    PathNode.LineTo(11.017f, 9.944f),
                    PathNode.CurveTo(10.90796f, 8.599818f, 11.29658f, 7.262424f, 12.109f, 6.186f),
                    PathNode.LineTo(12.278f, 5.974f),
                    PathNode.CurveTo(13.323201f, 4.722766f, 14.869653f, 3.999721f, 16.5f, 4.0f),
                    PathNode.MoveTo(16.5f, 7.5f),
                    PathNode.CurveTo(15.395431f, 7.5f, 14.5f, 8.395431f, 14.5f, 9.5f),
                    PathNode.CurveTo(14.5f, 10.604569f, 15.395431f, 11.5f, 16.5f, 11.5f),
                    PathNode.CurveTo(17.60457f, 11.5f, 18.5f, 10.604569f, 18.5f, 9.5f),
                    PathNode.CurveTo(18.5f, 8.395431f, 17.60457f, 7.5f, 16.5f, 7.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
