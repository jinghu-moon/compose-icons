package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Woman: ImageVector
    get() {
        if (_woman != null) return _woman!!
        _woman = tablerFilledIcon(
            name = "Woman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.CurveTo(15.91f, 8.0f, 17.79f, 8.752f, 19.625f, 10.219f),
                    PathNode.CurveTo(20.056334f, 10.564178f, 20.126179f, 11.193666f, 19.781f, 11.625f),
                    PathNode.CurveTo(19.435822f, 12.056334f, 18.806334f, 12.126178f, 18.375f, 11.781f),
                    PathNode.CurveTo(17.356f, 10.966f, 16.359f, 10.436f, 15.378f, 10.181f),
                    PathNode.LineTo(16.962f, 15.725f),
                    PathNode.CurveTo(17.048334f, 16.026834f, 16.987911f, 16.351694f, 16.798824f, 16.602303f),
                    PathNode.CurveTo(16.609737f, 16.85291f, 16.31394f, 17.000174f, 16.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(15.0f, 21.552284f, 14.552285f, 22.0f, 14.0f, 22.0f),
                    PathNode.CurveTo(13.447715f, 22.0f, 13.0f, 21.552284f, 13.0f, 21.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.CurveTo(11.0f, 21.552284f, 10.552285f, 22.0f, 10.0f, 22.0f),
                    PathNode.CurveTo(9.447715f, 22.0f, 9.0f, 21.552284f, 9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(7.686061f, 17.000174f, 7.390262f, 16.85291f, 7.201176f, 16.602303f),
                    PathNode.CurveTo(7.01209f, 16.351694f, 6.951667f, 16.026834f, 7.038f, 15.725f),
                    PathNode.LineTo(8.622f, 10.18f),
                    PathNode.CurveTo(7.642f, 10.436f, 6.644f, 10.966f, 5.625f, 11.781f),
                    PathNode.CurveTo(5.193666f, 12.126178f, 4.564178f, 12.056334f, 4.219f, 11.625f),
                    PathNode.CurveTo(3.873822f, 11.193666f, 3.943666f, 10.564178f, 4.375f, 10.219f),
                    PathNode.CurveTo(6.108f, 8.833f, 7.881f, 8.086001f, 9.682f, 8.007f),
                    PathNode.LineTo(10.017f, 8.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(13.656855f, 1.0f, 15.0f, 2.343146f, 15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 5.656854f, 13.656855f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 5.656854f, 9.0f, 4.0f),
                    PathNode.LineTo(9.005f, 3.824f),
                    PathNode.CurveTo(9.098195f, 2.238179f, 10.411443f, 0.999912f, 12.0f, 1.0f)
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
        return _woman!!
    }

private var _woman: ImageVector? = null
