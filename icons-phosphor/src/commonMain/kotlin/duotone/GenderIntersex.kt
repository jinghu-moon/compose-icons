package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorDuotoneIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.CurveTo(176.0f, 142.92795f, 150.92795f, 168.0f, 120.0f, 168.0f),
                    PathNode.CurveTo(89.07206f, 168.0f, 64.0f, 142.92795f, 64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 81.07206f, 89.07206f, 56.0f, 120.0f, 56.0f),
                    PathNode.CurveTo(150.92795f, 56.0f, 176.0f, 81.07206f, 176.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 24.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(163.58173f, 24.0f, 160.0f, 27.581722f, 160.0f, 32.0f),
                    PathNode.CurveTo(160.0f, 36.418278f, 163.58173f, 40.0f, 168.0f, 40.0f),
                    PathNode.LineTo(188.69f, 40.0f),
                    PathNode.LineTo(163.54f, 65.15f),
                    PathNode.CurveTo(143.26772f, 46.257645f, 113.139854f, 42.557785f, 88.89873f, 55.98366f),
                    PathNode.CurveTo(64.6576f, 69.40954f, 51.81047f, 96.910965f, 57.070187f, 124.11798f),
                    PathNode.CurveTo(62.329903f, 151.325f, 84.50152f, 172.05653f, 112.0f, 175.48f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.CurveTo(83.58172f, 192.0f, 80.0f, 195.58173f, 80.0f, 200.0f),
                    PathNode.CurveTo(80.0f, 204.41827f, 83.58172f, 208.0f, 88.0f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.LineTo(112.0f, 232.0f),
                    PathNode.CurveTo(112.0f, 236.41827f, 115.58172f, 240.0f, 120.0f, 240.0f),
                    PathNode.CurveTo(124.41828f, 240.0f, 128.0f, 236.41827f, 128.0f, 232.0f),
                    PathNode.LineTo(128.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(156.41827f, 208.0f, 160.0f, 204.41827f, 160.0f, 200.0f),
                    PathNode.CurveTo(160.0f, 195.58173f, 156.41827f, 192.0f, 152.0f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.LineTo(128.0f, 175.48f),
                    PathNode.CurveTo(149.79695f, 172.75717f, 168.66885f, 159.03276f, 177.97589f, 139.13553f),
                    PathNode.CurveTo(187.28293f, 119.23829f, 185.72113f, 95.955925f, 173.84f, 77.48f),
                    PathNode.LineTo(200.0f, 51.31f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.CurveTo(200.0f, 76.41828f, 203.58173f, 80.0f, 208.0f, 80.0f),
                    PathNode.CurveTo(212.41827f, 80.0f, 216.0f, 76.41828f, 216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(216.0f, 27.581722f, 212.41827f, 24.0f, 208.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 160.0f),
                    PathNode.CurveTo(93.49033f, 160.0f, 72.0f, 138.50967f, 72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 85.49033f, 93.49033f, 64.0f, 120.0f, 64.0f),
                    PathNode.CurveTo(146.50967f, 64.0f, 168.0f, 85.49033f, 168.0f, 112.0f),
                    PathNode.CurveTo(167.97244f, 138.49825f, 146.49825f, 159.97244f, 120.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
