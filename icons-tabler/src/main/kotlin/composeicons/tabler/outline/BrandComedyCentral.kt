package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandComedyCentral: ImageVector
    get() {
        if (_brandComedyCentral != null) return _brandComedyCentral!!
        _brandComedyCentral = tablerOutlineIcon(
            name = "BrandComedyCentral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.343f, 17.657f),
                    PathNode.CurveTo(8.467237f, 20.781076f, 13.532482f, 20.780989f, 16.65661f, 17.656807f),
                    PathNode.CurveTo(19.78074f, 14.532622f, 19.78074f, 9.467378f, 16.65661f, 6.343195f),
                    PathNode.CurveTo(13.532482f, 3.219011f, 8.467237f, 3.218924f, 5.343f, 6.343f)
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
                    PathNode.MoveTo(13.828f, 9.172f),
                    PathNode.CurveTo(12.684103f, 8.027758f, 10.963537f, 7.685313f, 9.468691f, 8.304366f),
                    PathNode.CurveTo(7.973845f, 8.92342f, 6.999146f, 10.382041f, 6.999146f, 12.0f),
                    PathNode.CurveTo(6.999146f, 13.617959f, 7.973845f, 15.07658f, 9.468691f, 15.695634f),
                    PathNode.CurveTo(10.963537f, 16.314688f, 12.684103f, 15.972242f, 13.828f, 14.828f)
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
        return _brandComedyCentral!!
    }

private var _brandComedyCentral: ImageVector? = null
