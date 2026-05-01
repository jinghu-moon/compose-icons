package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorLightIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.89f, 214.26f),
                    PathNode.LineTo(199.89f, 38.26f),
                    PathNode.CurveTo(199.01271f, 31.256105f, 193.05862f, 26.00073f, 186.0f, 26.0f),
                    PathNode.LineTo(70.0f, 26.0f),
                    PathNode.CurveTo(62.941376f, 26.00073f, 56.987286f, 31.256105f, 56.11f, 38.26f),
                    PathNode.LineTo(34.11f, 214.26f),
                    PathNode.CurveTo(33.61087f, 218.24486f, 34.847046f, 222.25218f, 37.504303f, 225.26337f),
                    PathNode.CurveTo(40.161564f, 228.27455f, 43.984f, 229.99959f, 48.0f, 230.0f),
                    PathNode.LineTo(88.69f, 230.0f),
                    PathNode.CurveTo(95.09675f, 229.99963f, 100.68577f, 225.65033f, 102.26f, 219.44f),
                    PathNode.LineTo(128.0f, 120.0f),
                    PathNode.LineTo(153.73f, 219.44f),
                    PathNode.CurveTo(155.30515f, 225.65395f, 160.89952f, 230.00421f, 167.31f, 230.0f),
                    PathNode.LineTo(208.0f, 230.0f),
                    PathNode.CurveTo(212.01599f, 229.99959f, 215.83842f, 228.27455f, 218.4957f, 225.26337f),
                    PathNode.CurveTo(221.15295f, 222.25218f, 222.38913f, 218.24486f, 221.89f, 214.26f),
                    PathNode.Close,
                    PathNode.MoveTo(195.22f, 97.66f),
                    PathNode.CurveTo(180.7031f, 95.57392f, 169.15018f, 84.43188f, 166.54f, 70.0f),
                    PathNode.LineTo(191.77f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 38.0f),
                    PathNode.LineTo(186.0f, 38.0f),
                    PathNode.CurveTo(187.01387f, 37.99205f, 187.87329f, 38.74404f, 188.0f, 39.75f),
                    PathNode.LineTo(190.27f, 58.0f),
                    PathNode.LineTo(65.73f, 58.0f),
                    PathNode.LineTo(68.0f, 39.75f),
                    PathNode.CurveTo(68.12671f, 38.74404f, 68.98612f, 37.99205f, 70.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.23f, 70.0f),
                    PathNode.LineTo(89.46f, 70.0f),
                    PathNode.CurveTo(86.84982f, 84.43188f, 75.2969f, 95.57392f, 60.78f, 97.66f),
                    PathNode.Close,
                    PathNode.MoveTo(90.63f, 216.49f),
                    PathNode.CurveTo(90.40553f, 217.37828f, 89.60619f, 218.00044f, 88.69f, 218.0f),
                    PathNode.LineTo(48.0f, 218.0f),
                    PathNode.CurveTo(47.423267f, 218.00453f, 46.872658f, 217.75986f, 46.489487f, 217.3288f),
                    PathNode.CurveTo(46.106316f, 216.89774f, 45.927887f, 216.32222f, 46.0f, 215.75f),
                    PathNode.LineTo(59.25f, 109.87f),
                    PathNode.CurveTo(81.032265f, 108.29762f, 98.71764f, 91.647896f, 101.6f, 70.0f),
                    PathNode.LineTo(122.0f, 70.0f),
                    PathNode.LineTo(122.0f, 95.24f),
                    PathNode.Close,
                    PathNode.MoveTo(209.5f, 217.32f),
                    PathNode.CurveTo(209.12086f, 217.75157f, 208.57445f, 217.99927f, 208.0f, 218.0f),
                    PathNode.LineTo(167.31f, 218.0f),
                    PathNode.CurveTo(166.37532f, 217.99953f, 165.56563f, 217.35176f, 165.36f, 216.44f),
                    PathNode.LineTo(134.0f, 95.24f),
                    PathNode.LineTo(134.0f, 70.0f),
                    PathNode.LineTo(154.4f, 70.0f),
                    PathNode.CurveTo(157.28236f, 91.647896f, 174.96774f, 108.29762f, 196.75f, 109.87f),
                    PathNode.LineTo(210.0f, 215.75f),
                    PathNode.CurveTo(210.06667f, 216.32086f, 209.8845f, 216.89282f, 209.5f, 217.32f),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
