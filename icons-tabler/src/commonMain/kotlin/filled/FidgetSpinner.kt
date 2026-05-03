package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FidgetSpinner: ImageVector
    get() {
        if (_fidgetSpinner != null) return _fidgetSpinner!!
        _fidgetSpinner = tablerFilledIcon(
            name = "FidgetSpinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 0f),
                    PathNode.CurveTo(14.010448f, -6.28E-4f, 15.825735f, 1.202948f, 16.607777f, 3.055058f),
                    PathNode.CurveTo(17.389816f, 4.907168f, 16.986488f, 7.04754f, 15.584f, 8.488f),
                    PathNode.LineTo(15.572f, 8.5f),
                    PathNode.CurveTo(16.249859f, 9.192402f, 16.711924f, 10.066851f, 16.902f, 11.017f),
                    PathNode.LineTo(16.92f, 11.118f),
                    PathNode.LineTo(17.171f, 11.07f),
                    PathNode.QuadTo(17.321f, 11.045f, 17.471f, 11.029f),
                    PathNode.LineTo(17.775f, 11.005f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(20.625143f, 11.000334f, 22.803013f, 13.030767f, 22.98706f, 15.64945f),
                    PathNode.CurveTo(23.17111f, 18.268133f, 21.298656f, 20.583235f, 18.699368f, 20.950756f),
                    PathNode.CurveTo(16.100079f, 21.31828f, 13.65918f, 19.613056f, 13.11f, 17.046f),
                    PathNode.LineTo(13.078f, 16.882f),
                    PathNode.LineTo(12.838f, 16.93f),
                    PathNode.CurveTo(12.653969f, 16.961027f, 12.468346f, 16.981726f, 12.282f, 16.992f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.QuadTo(11.573f, 17.0f, 11.16f, 16.93f),
                    PathNode.LineTo(10.921f, 16.882f),
                    PathNode.LineTo(10.917f, 16.907f),
                    PathNode.CurveTo(10.586732f, 18.695765f, 9.311076f, 20.164051f, 7.586f, 20.741f),
                    PathNode.LineTo(7.366f, 20.809f),
                    PathNode.CurveTo(5.38224f, 21.371635f, 3.256542f, 20.658766f, 2.013099f, 19.013859f),
                    PathNode.CurveTo(0.769656f, 17.368952f, 0.663527f, 15.129418f, 1.745846f, 13.374297f),
                    PathNode.CurveTo(2.828165f, 11.619175f, 4.876923f, 10.708481f, 6.905f, 11.081f),
                    PathNode.LineTo(7.078f, 11.117f),
                    PathNode.LineTo(7.097f, 11.015f),
                    PathNode.CurveTo(7.287f, 10.065f, 7.75f, 9.191f, 8.428f, 8.499f),
                    PathNode.LineTo(8.378001f, 8.447f),
                    PathNode.CurveTo(7.606446f, 7.633503f, 7.129432f, 6.58513f, 7.023f, 5.469f),
                    PathNode.LineTo(7.005f, 5.225f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 2.238576f, 9.238576f, 0f, 12.0f, 0f),
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.CurveTo(17.447716f, 15.0f, 17.0f, 15.447715f, 17.0f, 16.0f),
                    PathNode.LineTo(17.0f, 16.01f),
                    PathNode.CurveTo(17.0f, 16.562284f, 17.447716f, 17.01f, 18.0f, 17.01f),
                    PathNode.CurveTo(18.552284f, 17.01f, 19.0f, 16.562284f, 19.0f, 16.01f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 15.447715f, 18.552284f, 15.0f, 18.0f, 15.0f),
                    PathNode.MoveTo(6.0f, 15.0f),
                    PathNode.CurveTo(5.447716f, 15.0f, 5.0f, 15.447715f, 5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 16.01f),
                    PathNode.CurveTo(5.0f, 16.562284f, 5.447716f, 17.01f, 6.0f, 17.01f),
                    PathNode.CurveTo(6.552285f, 17.01f, 7.0f, 16.562284f, 7.0f, 16.01f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.CurveTo(7.0f, 15.447715f, 6.552285f, 15.0f, 6.0f, 15.0f),
                    PathNode.MoveTo(12.0f, 10.005f),
                    PathNode.CurveTo(10.9f, 10.005f, 10.01f, 10.896f, 10.01f, 11.995f),
                    PathNode.LineTo(10.01f, 12.015f),
                    PathNode.CurveTo(10.01f, 13.114047f, 10.900953f, 14.005f, 12.0f, 14.005f),
                    PathNode.CurveTo(13.099047f, 14.005f, 13.99f, 13.114047f, 13.99f, 12.015f),
                    PathNode.LineTo(13.99f, 11.995f),
                    PathNode.CurveTo(13.99f, 10.895953f, 13.099047f, 10.005f, 12.0f, 10.005f),
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(11.447715f, 4.0f, 11.0f, 4.447716f, 11.0f, 5.0f),
                    PathNode.LineTo(11.0f, 5.01f),
                    PathNode.CurveTo(11.0f, 5.562285f, 11.447715f, 6.01f, 12.0f, 6.01f),
                    PathNode.CurveTo(12.552285f, 6.01f, 13.0f, 5.562285f, 13.0f, 5.01f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.CurveTo(13.0f, 4.447716f, 12.552285f, 4.0f, 12.0f, 4.0f)
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
        return _fidgetSpinner!!
    }

private var _fidgetSpinner: ImageVector? = null
