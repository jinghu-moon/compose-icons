package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CloudDataConnection: ImageVector
    get() {
        if (_cloudDataConnection != null) return _cloudDataConnection!!
        _cloudDataConnection = tablerFilledIcon(
            name = "CloudDataConnection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.262f, 4.087f),
                    PathNode.CurveTo(16.236f, 4.855f, 16.828f, 5.935f, 16.94f, 7.084f),
                    PathNode.LineTo(16.947f, 7.191f),
                    PathNode.LineTo(17.127f, 7.216f),
                    PathNode.CurveTo(18.711447f, 7.473019f, 19.903946f, 8.797372f, 19.994f, 10.4f),
                    PathNode.LineTo(20.0f, 10.588f),
                    PathNode.CurveTo(19.995586f, 12.475642f, 18.462645f, 14.002765f, 16.575f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(13.001f, 15.171f),
                    PathNode.CurveTo(13.855681f, 15.473032f, 14.527968f, 16.145319f, 14.83f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.552284f, 17.0f, 22.0f, 17.447716f, 22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 18.552284f, 21.552284f, 19.0f, 21.0f, 19.0f),
                    PathNode.LineTo(14.83f, 19.0f),
                    PathNode.CurveTo(14.406601f, 20.19996f, 13.272467f, 21.00245f, 12.0f, 21.00245f),
                    PathNode.CurveTo(10.727533f, 21.00245f, 9.593399f, 20.19996f, 9.17f, 19.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(2.447715f, 19.0f, 2.0f, 18.552284f, 2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 17.447716f, 2.447715f, 17.0f, 3.0f, 17.0f),
                    PathNode.LineTo(9.171f, 17.0f),
                    PathNode.CurveTo(9.472777f, 16.144938f, 10.145103f, 15.472245f, 11.0f, 15.17f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(8.26f, 14.0f),
                    PathNode.CurveTo(5.919f, 14.0f, 4.0f, 12.174f, 4.0f, 9.897f),
                    PathNode.CurveTo(4.0f, 7.896f, 5.481f, 6.242f, 7.43f, 5.871f),
                    PathNode.LineTo(7.516f, 5.856f),
                    PathNode.LineTo(7.565f, 5.744f),
                    PathNode.CurveTo(8.079001f, 4.62f, 9.073f, 3.734f, 10.321f, 3.297f),
                    PathNode.LineTo(10.543f, 3.225f),
                    PathNode.CurveTo(12.17f, 2.735f, 13.963f, 3.059f, 15.263f, 4.087f)
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
        return _cloudDataConnection!!
    }

private var _cloudDataConnection: ImageVector? = null
