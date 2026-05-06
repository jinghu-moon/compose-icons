package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = radixIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.106 1.352c1.957 0 3.541 1.592 3.541 3.553 0 1.835-1.047 3.6-2.247 5.064-1.211 1.477-2.654 2.736-3.567 3.551-.166 .148-.406 .167-.591 .056l-.075-.056C6.253 12.705 4.81 11.446 3.6 9.97 2.399 8.505 1.352 6.74 1.352 4.905 1.353 2.945 2.936 1.352 4.893 1.352c1.115 0 1.842 .408 2.315 .942 .112 .126 .208 .259 .291 .391 .083-.132 .179-.264 .291-.391 .474-.535 1.201-.942 2.315-.942ZM10.106 2.352c-.836 0-1.287 .29-1.566 .605-.306 .346-.436 .745-.578 1.088-.077 .187-.26 .31-.462 .31C7.298 4.355 7.115 4.233 7.038 4.046 6.896 3.703 6.766 3.304 6.46 2.958 6.181 2.643 5.729 2.352 4.893 2.352 3.492 2.352 2.353 3.494 2.352 4.905c0 1.476 .858 3.011 2.021 4.43 1.021 1.245 2.222 2.333 3.127 3.141 .905-.807 2.107-1.895 3.128-3.141C11.791 7.917 12.647 6.381 12.647 4.905 12.647 3.494 11.508 2.352 10.106 2.352Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
