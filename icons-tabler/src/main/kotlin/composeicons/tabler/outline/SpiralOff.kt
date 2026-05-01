package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpiralOff: ImageVector
    get() {
        if (_spiralOff != null) return _spiralOff!!
        _spiralOff = tablerOutlineIcon(
            name = "SpiralOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.057f),
                    PathNode.CurveTo(10.1374f, 12.353326f, 10.34887f, 12.609227f, 10.614f, 12.8f),
                    PathNode.CurveTo(11.296f, 13.259f, 12.123f, 13.174f, 12.778f, 12.78f),
                    PathNode.MoveTo(13.881f, 9.86f),
                    PathNode.CurveTo(13.618747f, 8.955415f, 12.982257f, 8.206111f, 12.132f, 7.801f),
                    PathNode.CurveTo(11.968152f, 7.723325f, 11.79867f, 7.658139f, 11.625f, 7.606f),
                    PathNode.MoveTo(8.24f, 8.24f),
                    PathNode.CurveTo(7.655766f, 8.662475f, 7.19155f, 9.229735f, 6.893f, 9.886f),
                    PathNode.CurveTo(5.798f, 12.318f, 7.183f, 15.134f, 9.603f, 16.132f),
                    PathNode.CurveTo(11.558f, 16.938f, 13.7f, 16.482f, 15.253f, 15.248f),
                    PathNode.MoveTo(16.998f, 12.98f),
                    PathNode.LineTo(17.041f, 12.877f),
                    PathNode.CurveTo(18.401f, 9.534f, 16.484f, 5.743f, 13.145f, 4.467f),
                    PathNode.CurveTo(11.552f, 3.857f, 9.875f, 3.868f, 8.355f, 4.354f),
                    PathNode.MoveTo(5.776f, 5.762f),
                    PathNode.CurveTo(4.762295f, 6.591063f, 3.980869f, 7.668796f, 3.508f, 8.89f),
                    PathNode.CurveTo(1.878f, 13.143f, 4.331f, 17.914f, 8.59f, 19.466f),
                    PathNode.CurveTo(11.801f, 20.636f, 15.266f, 19.808f, 17.714f, 17.728f),
                    PathNode.MoveTo(19.583f, 15.579f),
                    PathNode.CurveTo(20.434668f, 14.220034f, 20.92262f, 12.664917f, 21.0f, 11.063f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _spiralOff!!
    }

private var _spiralOff: ImageVector? = null
