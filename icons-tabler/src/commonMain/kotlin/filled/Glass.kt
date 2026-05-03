package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Glass: ImageVector
    get() {
        if (_glass != null) return _glass!!
        _glass = tablerFilledIcon(
            name = "Glass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(15.205f, 2.0f, 17.894f, 3.05f, 17.997f, 4.89f),
                    PathNode.LineTo(18.987f, 10.836f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.0f, 14.226f, 16.44f, 16.564f, 13.0f, 16.945f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.552284f, 20.0f, 17.0f, 20.447716f, 17.0f, 21.0f),
                    PathNode.CurveTo(17.0f, 21.552284f, 16.552284f, 22.0f, 16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.447716f, 22.0f, 7.0f, 21.552284f, 7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 20.447716f, 7.447716f, 20.0f, 8.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 16.945f),
                    PathNode.CurveTo(7.56f, 16.565f, 5.0f, 14.226f, 5.0f, 11.0f),
                    PathNode.LineTo(5.014f, 10.836f),
                    PathNode.LineTo(6.005f, 4.881f),
                    PathNode.LineTo(6.006f, 4.843f),
                    PathNode.CurveTo(6.152f, 3.033f, 8.823f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(10.776f, 4.0f, 9.641f, 4.192f, 8.836f, 4.514f),
                    PathNode.CurveTo(8.242f, 4.752f, 8.0f, 4.981f, 8.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 5.02f, 8.242f, 5.248f, 8.836f, 5.486f),
                    PathNode.CurveTo(9.64f, 5.808f, 10.776f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(13.224f, 6.0f, 14.359f, 5.808f, 15.164f, 5.486f),
                    PathNode.CurveTo(15.758f, 5.248f, 16.0f, 5.019f, 16.0f, 5.0f),
                    PathNode.LineTo(15.98f, 4.974f),
                    PathNode.CurveTo(15.91f, 4.904f, 15.659f, 4.712f, 15.164f, 4.514f),
                    PathNode.CurveTo(14.36f, 4.192f, 13.224f, 4.0f, 12.0f, 4.0f)
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
        return _glass!!
    }

private var _glass: ImageVector? = null
