package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = radixIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.223 .666c.103-.246 .452-.246 .555 0L9.413 4.6c.043 .104 .141 .174 .253 .184l4.248 .341c.266 .021 .373 .353 .171 .526l-.229 .195L10.849 8.424c-.085 .073-.122 .188-.097 .297l.919 3.852 .07 .294c.054 .227-.156 .413-.361 .362l-.087-.037-.258-.158L7.656 10.97c-.096-.059-.217-.059-.312 0L3.707 13.191l-.087 .037c-.206 .05-.415-.135-.361-.362l.069-.294L4.248 8.72c.019-.082 .003-.167-.042-.235L4.151 8.424 .915 5.651C.713 5.478 .82 5.146 1.086 5.125l.301-.024L5.334 4.784c.084-.007 .16-.048 .211-.112l.042-.071L7.223 .666ZM6.51 4.984c-.164 .394-.508 .678-.917 .77l-.18 .027L2.843 5.986 4.802 7.664l.129 .127c.238 .269 .353 .626 .319 .983l-.029 .179-.599 2.507L6.822 10.117l.161-.083c.329-.143 .704-.143 1.033 0l.161 .083 2.199 1.343L9.779 8.953c-.113-.474 .049-.972 .419-1.289L12.156 5.986 9.587 5.781C9.162 5.747 8.784 5.507 8.571 5.146L8.49 4.984 7.5 2.603 6.51 4.984Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
