package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorDuotoneIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.66 145.66 85 235c-6.728 5.979-16.949 5.678-23.314-.686C55.322 227.949 55.021 217.728 61 211l64.69-65.37c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66L77 85C70.389 78.366 70.389 67.634 77 61h0c6.634-6.611 17.366-6.611 24 0l72.69 73.37c3.1 3.13 3.087 8.177-.03 11.29Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M220.28 55l-.17-.17L175.21 12.55c-6.255-6.142-16.288-6.106-22.5 .08L108.17 56.87l-1.54-1.56C96.767 46.324 81.585 46.667 72.138 56.09c-9.447 9.423-9.829 24.604-.868 34.49l1.46 1.48L52.69 112c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l12.68 12.68c6.244 6.223 16.346 6.223 22.59 0l19.93-19.65L120 140h0 0L55.31 205.37c-6.817 6.203-9.667 15.654-7.417 24.592 2.25 8.938 9.235 15.913 18.176 18.15 8.941 2.237 18.388-.627 24.582-7.452l88.67-89.35c6.23-6.245 6.23-16.355 0-22.6L143.63 92.66 156.56 80l.1 .09L194 115.4c6.262 6.159 16.318 6.119 22.53-.09l3.71-3.71c7.502-7.502 11.716-17.676 11.716-28.285 0-10.609-4.215-20.783-11.716-28.285ZM76.69 136 64 123.33 84 103.45l12.69 12.86ZM79.31 229.37c-2.194 2.6-5.667 3.74-8.976 2.947-3.308-.793-5.887-3.384-6.664-6.696-.777-3.312 .38-6.78 2.99-8.961l64.67-65.37c6.21-6.242 6.21-16.328 0-22.57L82.63 79.31c-3.036-3.567-2.829-8.867 .477-12.185 3.306-3.319 8.605-3.547 12.183-.525L168 140ZM209 100.28 205.25 104c-.048-.058-.102-.112-.16-.16L167.69 68.5c-6.264-6.032-16.191-5.979-22.39 .12L132.37 81.29 119.43 68.23 164 24l.17 .16 44.88 42.26c9.297 9.385 9.261 24.519-.08 33.86Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
