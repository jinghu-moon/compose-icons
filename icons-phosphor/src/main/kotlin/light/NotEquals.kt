package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorLightIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 160.0f),
                    PathNode.CurveTo(222.0f, 163.3137f, 219.3137f, 166.0f, 216.0f, 166.0f),
                    PathNode.LineTo(101.56f, 166.0f),
                    PathNode.LineTo(52.44f, 220.0f),
                    PathNode.CurveTo(51.076042f, 221.81671f, 48.803024f, 222.7073f, 46.567955f, 222.30074f),
                    PathNode.CurveTo(44.33289f, 221.89415f, 42.519123f, 220.26012f, 41.882336f, 218.07945f),
                    PathNode.CurveTo(41.24555f, 215.89877f, 41.89496f, 213.54547f, 43.56f, 212.0f),
                    PathNode.LineTo(85.35f, 166.0f),
                    PathNode.LineTo(40.0f, 166.0f),
                    PathNode.CurveTo(36.68629f, 166.0f, 34.0f, 163.3137f, 34.0f, 160.0f),
                    PathNode.CurveTo(34.0f, 156.6863f, 36.68629f, 154.0f, 40.0f, 154.0f),
                    PathNode.LineTo(96.25f, 154.0f),
                    PathNode.LineTo(143.53f, 102.0f),
                    PathNode.LineTo(40.0f, 102.0f),
                    PathNode.CurveTo(36.68629f, 102.0f, 34.0f, 99.313705f, 34.0f, 96.0f),
                    PathNode.CurveTo(34.0f, 92.686295f, 36.68629f, 90.0f, 40.0f, 90.0f),
                    PathNode.LineTo(154.44f, 90.0f),
                    PathNode.LineTo(203.56f, 36.0f),
                    PathNode.CurveTo(204.92395f, 34.18328f, 207.19698f, 33.292686f, 209.43204f, 33.699272f),
                    PathNode.CurveTo(211.66711f, 34.105858f, 213.48088f, 35.739876f, 214.11766f, 37.92055f),
                    PathNode.CurveTo(214.75446f, 40.101227f, 214.10504f, 42.454533f, 212.44f, 44.0f),
                    PathNode.LineTo(170.65f, 90.0f),
                    PathNode.LineTo(216.0f, 90.0f),
                    PathNode.CurveTo(219.3137f, 90.0f, 222.0f, 92.686295f, 222.0f, 96.0f),
                    PathNode.CurveTo(222.0f, 99.313705f, 219.3137f, 102.0f, 216.0f, 102.0f),
                    PathNode.LineTo(159.75f, 102.0f),
                    PathNode.LineTo(112.47f, 154.0f),
                    PathNode.LineTo(216.0f, 154.0f),
                    PathNode.CurveTo(219.3137f, 154.0f, 222.0f, 156.6863f, 222.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
