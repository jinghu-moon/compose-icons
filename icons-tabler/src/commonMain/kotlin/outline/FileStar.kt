package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileStar: ImageVector
    get() {
        if (_fileStar != null) return _fileStar!!
        _fileStar = tablerOutlineIcon(
            name = "FileStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.8f, 16.817f),
                    PathNode.LineTo(9.628f, 17.955f),
                    PathNode.CurveTo(9.496547f, 18.023417f, 9.337749f, 18.011858f, 9.21759f, 17.925123f),
                    PathNode.CurveTo(9.097432f, 17.838388f, 9.036456f, 17.691307f, 9.06f, 17.545f),
                    PathNode.LineTo(9.475f, 15.134f),
                    PathNode.LineTo(7.718f, 13.427f),
                    PathNode.CurveTo(7.610998f, 13.323559f, 7.572394f, 13.168132f, 7.618563f, 13.026647f),
                    PathNode.CurveTo(7.664732f, 12.885161f, 7.78758f, 12.782419f, 7.935f, 12.762f),
                    PathNode.LineTo(10.363f, 12.41f),
                    PathNode.LineTo(11.449f, 10.217f),
                    PathNode.CurveTo(11.515247f, 10.083773f, 11.651211f, 9.999537f, 11.8f, 9.999537f),
                    PathNode.CurveTo(11.94879f, 9.999537f, 12.084752f, 10.083773f, 12.151f, 10.217f),
                    PathNode.LineTo(13.237f, 12.41f),
                    PathNode.LineTo(15.665f, 12.762f),
                    PathNode.CurveTo(15.81196f, 12.783141f, 15.934169f, 12.885893f, 15.980227f, 13.027041f),
                    PathNode.CurveTo(16.026287f, 13.16819f, 15.988206f, 13.323247f, 15.882f, 13.427f),
                    PathNode.LineTo(14.125f, 15.134f),
                    PathNode.LineTo(14.539f, 17.544f),
                    PathNode.CurveTo(14.564349f, 17.690619f, 14.504064f, 17.838884f, 14.383592f, 17.92621f),
                    PathNode.CurveTo(14.26312f, 18.013536f, 14.103456f, 18.024704f, 13.972f, 17.955f),
                    PathNode.LineTo(11.8f, 16.817f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fileStar!!
    }

private var _fileStar: ImageVector? = null
