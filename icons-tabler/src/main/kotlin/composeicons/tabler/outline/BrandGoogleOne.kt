package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleOne: ImageVector
    get() {
        if (_brandGoogleOne != null) return _brandGoogleOne!!
        _brandGoogleOne = tablerOutlineIcon(
            name = "BrandGoogleOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 5.0f),
                    PathNode.LineTo(11.0f, 18.982f),
                    PathNode.CurveTo(11.0f, 20.086569f, 11.895431f, 20.982f, 13.0f, 20.982f),
                    PathNode.CurveTo(14.104569f, 20.982f, 15.0f, 20.086569f, 15.0f, 18.982f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.895431f, 14.104569f, 3.0f, 13.0f, 3.0f),
                    PathNode.CurveTo(11.895431f, 3.0f, 11.0f, 3.895431f, 11.0f, 5.0f)
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
                    PathNode.MoveTo(6.63f, 8.407f),
                    PathNode.CurveTo(5.81911f, 9.209388f, 5.786446f, 10.508886f, 6.556f, 11.351f),
                    PathNode.CurveTo(7.326f, 12.185f, 8.607f, 12.22f, 9.418f, 11.428f),
                    PathNode.LineTo(14.368f, 6.594f),
                    PathNode.CurveTo(15.18f, 5.802f, 15.214f, 4.484f, 14.444f, 3.649f),
                    PathNode.CurveTo(14.080503f, 3.249495f, 13.569836f, 3.015459f, 13.029906f, 3.000927f),
                    PathNode.CurveTo(12.489976f, 2.986396f, 11.967461f, 3.192625f, 11.583f, 3.572f),
                    PathNode.LineTo(6.63f, 8.407f)
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
        return _brandGoogleOne!!
    }

private var _brandGoogleOne: ImageVector? = null
