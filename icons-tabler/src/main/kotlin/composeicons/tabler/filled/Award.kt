package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Award: ImageVector
    get() {
        if (_award != null) return _award!!
        _award = tablerFilledIcon(
            name = "Award",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.496 13.983l1.966 3.406c.164 .285 .178 .632 .038 .929-.141 .297-.418 .506-.743 .559l-.113 .011-.112-.001-2.933-.19-1.303 2.636c-.144 .29-.418 .492-.737 .544-.319 .052-.643-.054-.871-.284l-.082-.094-.072-.11L12.566 17.982c2.808-.176 5.373-1.655 6.93-3.999Z")
            addPathData("M11.43 17.982 9.464 21.39c-.162 .28-.449 .465-.771 .496-.322 .031-.639-.095-.851-.339l-.076-.1-.064-.114L6.398 18.698l-2.931 .19c-.328 .021-.645-.12-.849-.377-.204-.257-.269-.598-.173-.913l.04-.107 .05-.1L4.503 13.982c1.556 2.344 4.119 3.824 6.927 4.001Z")
            addPathData("M12 2l.24 .004C16.01 2.133 19 5.227 19 9l-.003 .193-.007 .192-.018 .245-.026 .242-.024 .178c-.066 .432-.172 .856-.317 1.268l-.116 .308-.153 .348c-1.156 2.462-3.633 4.032-6.353 4.026C9.263 15.994 6.793 14.413 5.648 11.946l-.13-.297-.052-.133-.08-.217-.095-.294c-.034-.114-.065-.229-.093-.344l-.06-.271-.049-.271L5.069 9.98 5.03 9.657 5.006 9.292 5 9C5 5.227 7.99 2.133 11.76 2.004L12 2Z")
        }
        return _award!!
    }

private var _award: ImageVector? = null
