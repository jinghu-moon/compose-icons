package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MedicalCross: ImageVector
    get() {
        if (_medicalCross != null) return _medicalCross!!
        _medicalCross = tablerFilledIcon(
            name = "MedicalCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 2.0f),
                    PathNode.LineTo(10.85f, 2.005f),
                    PathNode.CurveTo(9.806323f, 2.083497f, 8.999669f, 2.953375f, 9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 6.803f),
                    PathNode.LineTo(6.572f, 5.402f),
                    PathNode.CurveTo(5.61544f, 4.849742f, 4.392301f, 5.177464f, 3.84f, 6.134f),
                    PathNode.LineTo(2.84f, 7.866f),
                    PathNode.LineTo(2.767f, 8.004f),
                    PathNode.CurveTo(2.317062f, 8.946235f, 2.667675f, 10.076036f, 3.572f, 10.598f),
                    PathNode.LineTo(5.999f, 12.0f),
                    PathNode.LineTo(3.572f, 13.402f),
                    PathNode.CurveTo(2.615464f, 13.954301f, 2.287742f, 15.17744f, 2.84f, 16.134f),
                    PathNode.LineTo(3.84f, 17.866f),
                    PathNode.LineTo(3.923f, 17.998f),
                    PathNode.CurveTo(4.513986f, 18.858845f, 5.66776f, 19.120176f, 6.572f, 18.598f),
                    PathNode.LineTo(9.0f, 17.196f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(9.0f, 21.10457f, 9.895431f, 22.0f, 11.0f, 22.0f),
                    PathNode.LineTo(13.0f, 22.0f),
                    PathNode.LineTo(13.15f, 21.995f),
                    PathNode.CurveTo(14.193677f, 21.916504f, 15.000331f, 21.046625f, 15.0f, 20.0f),
                    PathNode.LineTo(15.0f, 17.196f),
                    PathNode.LineTo(17.428f, 18.599f),
                    PathNode.CurveTo(18.384562f, 19.151258f, 19.607698f, 18.823536f, 20.16f, 17.867f),
                    PathNode.LineTo(21.16f, 16.135f),
                    PathNode.LineTo(21.233f, 15.997f),
                    PathNode.CurveTo(21.682938f, 15.054766f, 21.332323f, 13.924964f, 20.428f, 13.403f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(20.428f, 10.598f),
                    PathNode.CurveTo(21.384537f, 10.045699f, 21.71226f, 8.82256f, 21.16f, 7.866f),
                    PathNode.LineTo(20.16f, 6.134f),
                    PathNode.LineTo(20.077f, 6.002f),
                    PathNode.CurveTo(19.486013f, 5.141155f, 18.332241f, 4.879825f, 17.428f, 5.402f),
                    PathNode.LineTo(15.0f, 6.802f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 2.895431f, 14.104569f, 2.0f, 13.0f, 2.0f),
                    PathNode.LineTo(11.0f, 2.0f),
                    PathNode.Close
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
        return _medicalCross!!
    }

private var _medicalCross: ImageVector? = null
