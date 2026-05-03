package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerStar: ImageVector
    get() {
        if (_pointerStar != null) return _pointerStar!!
        _pointerStar = tablerOutlineIcon(
            name = "PointerStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.891f, 10.132f),
                    PathNode.CurveTo(18.332384f, 9.894277f, 18.579472f, 9.407218f, 18.510603f, 8.910641f),
                    PathNode.CurveTo(18.44173f, 8.414063f, 18.071419f, 8.012631f, 17.582f, 7.904f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.LineTo(7.904f, 17.563f),
                    PathNode.CurveTo(8.012911f, 18.052284f, 8.414471f, 18.422323f, 8.911007f, 18.490965f),
                    PathNode.CurveTo(9.407543f, 18.559607f, 9.894433f, 18.312386f, 10.132f, 17.871f)
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
                    PathNode.MoveTo(17.8f, 20.817f),
                    PathNode.LineTo(15.628f, 21.955f),
                    PathNode.CurveTo(15.496547f, 22.023417f, 15.337749f, 22.011858f, 15.21759f, 21.925123f),
                    PathNode.CurveTo(15.097432f, 21.838388f, 15.036456f, 21.691307f, 15.06f, 21.545f),
                    PathNode.LineTo(15.475f, 19.134f),
                    PathNode.LineTo(13.718f, 17.427f),
                    PathNode.CurveTo(13.610998f, 17.323559f, 13.572393f, 17.168133f, 13.618563f, 17.026648f),
                    PathNode.CurveTo(13.664731f, 16.885162f, 13.78758f, 16.78242f, 13.935f, 16.762f),
                    PathNode.LineTo(16.363f, 16.41f),
                    PathNode.LineTo(17.449f, 14.217f),
                    PathNode.CurveTo(17.515247f, 14.083773f, 17.65121f, 13.999537f, 17.8f, 13.999537f),
                    PathNode.CurveTo(17.94879f, 13.999537f, 18.084755f, 14.083773f, 18.151f, 14.217f),
                    PathNode.LineTo(19.237f, 16.41f),
                    PathNode.LineTo(21.665f, 16.762f),
                    PathNode.CurveTo(21.81196f, 16.78314f, 21.93417f, 16.885893f, 21.980228f, 17.027042f),
                    PathNode.CurveTo(22.026287f, 17.16819f, 21.988203f, 17.323248f, 21.882f, 17.427f),
                    PathNode.LineTo(20.125f, 19.134f),
                    PathNode.LineTo(20.539f, 21.544f),
                    PathNode.CurveTo(20.564348f, 21.690619f, 20.504063f, 21.838884f, 20.38359f, 21.92621f),
                    PathNode.CurveTo(20.263119f, 22.013536f, 20.103456f, 22.024704f, 19.972f, 21.955f),
                    PathNode.LineTo(17.8f, 20.817f)
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
        return _pointerStar!!
    }

private var _pointerStar: ImageVector? = null
