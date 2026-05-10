package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandPeace: ImageVector
    get() {
        if (_handPeace != null) return _handPeace!!
        _handPeace = phosphorFillIcon(
            name = "HandPeace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96.55 36.14c-2.261-8.417 2.629-17.095 11-19.52 8.61-2.46 17.65 3 20 11.65l16 59.78c.298 1.088 .123 2.252-.482 3.204-.606 .952-1.585 1.604-2.698 1.796C135.943 93.808 131.727 95.495 128 98c-.56 .37-1.1 .76-1.64 1.17-.33-.58-.67-1.16-1-1.72-3.418-5.194-8.286-9.269-14-11.72-1.113-.481-1.943-1.447-2.25-2.62ZM80.4 176.65c1.063 .218 2.145 .329 3.23 .33 8.214-.007 15.089-6.233 15.907-14.407 .818-8.173-4.687-15.638-12.737-17.273l-19.59-4c-8.616-1.678-16.976 3.9-18.734 12.5-1.758 8.6 3.741 17.011 12.324 18.85ZM60.8 123.65l34.64 7.07c5.638 1.237 11.505-.659 15.353-4.96 3.848-4.302 5.082-10.343 3.227-15.808-1.854-5.466-6.509-9.509-12.18-10.581L67.21 92.33C58.553 90.56 50.1 96.143 48.33 104.8c-1.77 8.657 3.813 17.11 12.47 18.88ZM162.8 95.49l23.55 4.81c2.061 .417 4.093-.833 4.65-2.86L207.42 36.14c2.25-8.522-2.816-17.258-11.33-19.539-8.514-2.281-17.268 2.754-19.58 11.259L159.71 90.56c-.287 1.071-.116 2.213 .472 3.154 .588 .94 1.539 1.595 2.628 1.806ZM200.14 127.23c-3.461-5.691-9.142-9.678-15.67-11L148.87 109c-5.57-1.138-11.326 .765-15.12 5-.99 1.057-1.81 2.261-2.43 3.57-2.754 5.524-2.084 12.139 1.72 17 2.454 3.083 5.93 5.187 9.8 5.93l15.24 3.11c4.306 .876 7.117 5.039 6.32 9.36-1.345 6.462-.364 13.191 2.77 19 1.987 3.475 1.171 7.878-1.93 10.41-1.846 1.447-4.233 2.011-6.531 1.544-2.298-.468-4.275-1.92-5.409-3.974-3.732-6.755-5.622-14.373-5.48-22.09L139.27 156C130.959 154.326 123.662 149.401 119 142.32c-.38-.57-.73-1.15-1.06-1.74-2.116 1.613-4.423 2.956-6.87 4 5.909 9.883 6.051 22.179 .374 32.197C105.767 186.795 95.145 192.991 83.63 193c-2.16-.001-4.314-.219-6.43-.65l-19.59-4h-.06c-.96-.227-1.966 .105-2.6 .86-.635 .755-.789 1.803-.4 2.71C67.308 221.115 96.139 239.988 128 240h.61C172.38 239.67 208 203.38 208 159.1v-3.34c-.003-10.033-2.715-19.88-7.85-28.5Z"),
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
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
