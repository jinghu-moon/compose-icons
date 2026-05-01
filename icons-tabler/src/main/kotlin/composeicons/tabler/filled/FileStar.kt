package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileStar: ImageVector
    get() {
        if (_fileStar != null) return _fileStar!!
        _fileStar = tablerFilledIcon(
            name = "FileStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.117f, 2.007f),
                    PathNode.CurveTo(12.576491f, 2.061188f, 12.938812f, 2.423509f, 12.993f, 2.883f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.005f, 7.15f),
                    PathNode.CurveTo(13.078939f, 8.133892f, 13.859354f, 8.916854f, 14.843f, 8.994f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.117f, 9.007f),
                    PathNode.CurveTo(19.57649f, 9.061188f, 19.938812f, 9.423509f, 19.993f, 9.883f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.000088f, 20.588558f, 18.761822f, 21.901804f, 17.176f, 21.995f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.411443f, 22.000088f, 4.098196f, 20.761822f, 4.005f, 19.176f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(3.999912f, 3.411442f, 5.238179f, 2.098195f, 6.824f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.8f, 11.0f),
                    PathNode.CurveTo(11.65118f, 10.999439f, 11.515015f, 11.083622f, 11.449f, 11.217f),
                    PathNode.LineTo(10.363f, 13.41f),
                    PathNode.LineTo(7.935f, 13.762f),
                    PathNode.CurveTo(7.78758f, 13.782419f, 7.664732f, 13.885161f, 7.618563f, 14.026647f),
                    PathNode.CurveTo(7.572394f, 14.168132f, 7.610998f, 14.323559f, 7.718f, 14.427f),
                    PathNode.LineTo(9.475f, 16.134f),
                    PathNode.LineTo(9.06f, 18.545f),
                    PathNode.CurveTo(9.036456f, 18.691307f, 9.097432f, 18.838388f, 9.21759f, 18.925123f),
                    PathNode.CurveTo(9.337749f, 19.011858f, 9.496547f, 19.023417f, 9.628f, 18.955f),
                    PathNode.LineTo(11.8f, 17.817f),
                    PathNode.LineTo(13.972f, 18.955f),
                    PathNode.CurveTo(14.103456f, 19.024704f, 14.26312f, 19.013536f, 14.383592f, 18.92621f),
                    PathNode.CurveTo(14.504064f, 18.838884f, 14.564349f, 18.690619f, 14.539f, 18.544f),
                    PathNode.LineTo(14.125f, 16.134f),
                    PathNode.LineTo(15.882f, 14.427f),
                    PathNode.CurveTo(15.988206f, 14.323247f, 16.026287f, 14.16819f, 15.980227f, 14.027041f),
                    PathNode.CurveTo(15.934169f, 13.885893f, 15.81196f, 13.783141f, 15.665f, 13.762f),
                    PathNode.LineTo(13.237f, 13.41f),
                    PathNode.LineTo(12.151f, 11.217f),
                    PathNode.CurveTo(12.084986f, 11.083622f, 11.948819f, 10.999439f, 11.8f, 11.0f)
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
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(14.999f, 2.999f),
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
        }
        return _fileStar!!
    }

private var _fileStar: ImageVector? = null
