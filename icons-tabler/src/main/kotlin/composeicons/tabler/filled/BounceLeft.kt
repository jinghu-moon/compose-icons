package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BounceLeft: ImageVector
    get() {
        if (_bounceLeft != null) return _bounceLeft!!
        _bounceLeft = tablerFilledIcon(
            name = "BounceLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.486f, 11.143f),
                    PathNode.CurveTo(8.959368f, 10.859526f, 9.572885f, 11.013017f, 9.857f, 11.486f),
                    PathNode.CurveTo(10.902f, 13.226f, 11.687f, 14.929f, 12.249f, 16.723f),
                    PathNode.LineTo(12.421f, 17.304f),
                    PathNode.LineTo(12.513f, 17.174f),
                    PathNode.CurveTo(14.606f, 14.253f, 16.993f, 13.521f, 20.078f, 14.474f),
                    PathNode.LineTo(20.316f, 14.551f),
                    PathNode.CurveTo(20.840118f, 14.725522f, 21.123522f, 15.291882f, 20.949f, 15.816f),
                    PathNode.CurveTo(20.774479f, 16.340118f, 20.208118f, 16.623522f, 19.684f, 16.449f),
                    PathNode.CurveTo(16.752f, 15.471f, 14.954f, 16.327f, 12.894f, 20.447f),
                    PathNode.CurveTo(12.461f, 21.313f, 11.173f, 21.12f, 11.014f, 20.164f),
                    PathNode.CurveTo(10.554f, 17.404f, 9.645f, 15.019f, 8.143f, 12.514f),
                    PathNode.CurveTo(7.859526f, 12.040632f, 8.013017f, 11.427115f, 8.486f, 11.143f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.CurveTo(4.343146f, 4.0f, 3.0f, 5.343146f, 3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 8.656855f, 4.343146f, 10.0f, 6.0f, 10.0f),
                    PathNode.CurveTo(7.656854f, 10.0f, 9.0f, 8.656855f, 9.0f, 7.0f),
                    PathNode.CurveTo(9.0f, 5.343146f, 7.656854f, 4.0f, 6.0f, 4.0f)
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
        return _bounceLeft!!
    }

private var _bounceLeft: ImageVector? = null
