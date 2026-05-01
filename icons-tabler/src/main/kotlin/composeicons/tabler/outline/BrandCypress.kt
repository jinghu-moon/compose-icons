package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCypress: ImageVector
    get() {
        if (_brandCypress != null) return _brandCypress!!
        _brandCypress = tablerOutlineIcon(
            name = "BrandCypress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.48f, 17.007f),
                    PathNode.CurveTo(21.777052f, 13.576041f, 21.444902f, 9.022153f, 18.674316f, 5.960816f),
                    PathNode.CurveTo(15.90373f, 2.899479f, 11.40546f, 2.116032f, 7.763043f, 4.06044f),
                    PathNode.CurveTo(4.120626f, 6.004849f, 2.268467f, 10.178304f, 3.270335f, 14.183824f),
                    PathNode.CurveTo(4.272204f, 18.189342f, 7.871086f, 20.999372f, 12.0f, 21.0f),
                    PathNode.CurveTo(12.896f, 21.0f, 13.691f, 20.427f, 13.974f, 19.577f),
                    PathNode.LineTo(17.5f, 9.0f)
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
                    PathNode.MoveTo(13.5f, 9.0f),
                    PathNode.LineTo(15.5f, 15.0f)
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
                    PathNode.MoveTo(10.764f, 9.411f),
                    PathNode.CurveTo(9.506577f, 8.674152f, 7.901489f, 8.947608f, 6.958991f, 10.059252f),
                    PathNode.CurveTo(6.016492f, 11.170896f, 6.009277f, 12.799096f, 6.941886f, 13.919049f),
                    PathNode.CurveTo(7.874495f, 15.039003f, 9.477097f, 15.326674f, 10.741f, 14.601f)
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
        return _brandCypress!!
    }

private var _brandCypress: ImageVector? = null
