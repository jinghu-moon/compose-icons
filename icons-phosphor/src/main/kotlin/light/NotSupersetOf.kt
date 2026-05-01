package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorLightIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 194.0f),
                    PathNode.LineTo(76.11f, 194.0f),
                    PathNode.LineTo(101.56f, 166.0f),
                    PathNode.LineTo(152.0f, 166.0f),
                    PathNode.CurveTo(176.79509f, 165.97354f, 199.19002f, 151.17686f, 208.93968f, 128.37903f),
                    PathNode.CurveTo(218.68935f, 105.58121f, 213.91864f, 79.16691f, 196.81f, 61.22f),
                    PathNode.LineTo(212.44f, 44.0f),
                    PathNode.CurveTo(214.10504f, 42.454533f, 214.75446f, 40.101227f, 214.11766f, 37.92055f),
                    PathNode.CurveTo(213.48088f, 35.739876f, 211.66711f, 34.105858f, 209.43204f, 33.699272f),
                    PathNode.CurveTo(207.19698f, 33.292686f, 204.92395f, 34.18328f, 203.56f, 36.0f),
                    PathNode.LineTo(187.73f, 53.38f),
                    PathNode.CurveTo(177.29175f, 45.9663f, 164.80313f, 41.988674f, 152.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(52.68629f, 42.0f, 50.0f, 44.68629f, 50.0f, 48.0f),
                    PathNode.CurveTo(50.0f, 51.31371f, 52.68629f, 54.0f, 56.0f, 54.0f),
                    PathNode.LineTo(152.0f, 54.0f),
                    PathNode.CurveTo(161.81781f, 53.98891f, 171.4187f, 56.887623f, 179.59f, 62.33f),
                    PathNode.LineTo(96.25f, 154.0f),
                    PathNode.LineTo(56.0f, 154.0f),
                    PathNode.CurveTo(52.68629f, 154.0f, 50.0f, 156.6863f, 50.0f, 160.0f),
                    PathNode.CurveTo(50.0f, 163.3137f, 52.68629f, 166.0f, 56.0f, 166.0f),
                    PathNode.LineTo(85.35f, 166.0f),
                    PathNode.LineTo(43.56f, 212.0f),
                    PathNode.CurveTo(41.69497f, 214.48413f, 42.03432f, 217.98099f, 44.342197f, 220.06017f),
                    PathNode.CurveTo(46.65007f, 222.13933f, 50.163273f, 222.11322f, 52.44f, 220.0f),
                    PathNode.LineTo(65.2f, 206.0f),
                    PathNode.LineTo(208.0f, 206.0f),
                    PathNode.CurveTo(211.3137f, 206.0f, 214.0f, 203.3137f, 214.0f, 200.0f),
                    PathNode.CurveTo(214.0f, 196.6863f, 211.3137f, 194.0f, 208.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.73f, 70.12f),
                    PathNode.CurveTo(202.17625f, 84.71382f, 205.71956f, 105.87828f, 197.75983f, 124.055855f),
                    PathNode.CurveTo(189.8001f, 142.23343f, 171.84392f, 153.98352f, 152.0f, 154.0f),
                    PathNode.LineTo(112.47f, 154.0f),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
